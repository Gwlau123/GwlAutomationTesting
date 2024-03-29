package xpath_css;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



/**
 * Use this class to work with standard Tables in any web page, <br>
 * <table><tbody> 
 * <tr> <th>Heading1</th> <th>Heading2</th> </tr>
 * <tr> <td>Data1.1</td> <td>Data1.2</td> </tr>
 * <tr> <td>Data2.1</td> <td>Data2.2</td> </tr>
 * </tbody> </table>
 */
public class WebTable {


	private By locator;
	private WebDriver driver;
	public WebTable(By locator, WebDriver driver) {
		this.locator=locator;
		this.driver = driver;
	}

	public String toString() {
		return locator.toString();
	}

	private WebElement getWebElement() {
		WebElement elem=null;
		try{
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfAllElementsLocatedBy(locator)));
			elem=getInteractableWebElementFromList(locator);
		}catch (Exception e) {
			e.printStackTrace();
		}

		return elem;
	}

	/**
	 * This method provides you the list<WebElement> of all rows 
	 * of the table, whose locator was passed in WebTable 
	 * class constructor
	 * 
	 * @author shailendra.rajawat 19 Feb 2019
	 * */
	private List<WebElement> getRowsList() {
		List<WebElement> listTR = null;
		try{
			driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
			listTR = new ArrayList<WebElement>();
			// Getting null pointer exception on this line, even though the table is getting displayed 
			List<WebElement> listHeadTR = getWebElement().findElements(By.xpath("thead/tr"));
			listTR.addAll(listHeadTR);
			List<WebElement> listBodyTR = getWebElement().findElements(By.xpath("tbody/tr"));
			listTR.addAll(listBodyTR);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}catch(Exception e){
			System.out.println("getRowsList() method failed for locator "+locator+" <br/><br/> Outer HTML "+getWebElement().getAttribute("outerHTML"));
		}
		return listTR;
	}

	/**
	 * use this method to get the Row count of a "table"
	 * 
	 * @return int rowCount the count of tr, and in case of exception will
	 *         return -1
	 */
	public int getRowCount() {

		int rowCount = -1;
		try {
			rowCount = getRowsList().size();
		} catch (Exception e) {
			//new CustomExceptionHandler(e);
		}

		return rowCount;
	}

	/**
	 * use this method to get the Column count in a Row of a "table"
	 * 
	 * @param rowNum
	 *            The Row number, from which the column count is need to be
	 *            fetched
	 * @return int colCount the count of td inside tr, and in case of exception
	 *         will return -1
	 */
	public int getColCount(int rowNum) {
		int colCount = -1;
		try {
			List<WebElement> listTR = getRowsList();
			List<WebElement> listTD_TH = listTR.get(rowNum - 1).findElements(By.xpath("td|th"));
			colCount = listTD_TH.size();
			//List<WebElement> listTR = getRowList();
			// List<WebElement>
			// listTD_TH=listTR.get(rowNum-1).findElements(By.cssSelector("th,td"));

		} catch (Exception e) {
			//new CustomExceptionHandler(e);
		}
		return colCount;
	}

	/**
	 * use this method to get the String innerText of the cell pointed by rowNum
	 * and colNum
	 * 
	 * @param rowNum
	 *            The Row number of cell
	 * @param rowNum
	 *            The Column number of cell
	 * @return The innerText displayed in the cell, and in case of exception
	 *         will return null
	 */
	public String getCellText(int rowNum, int colNum) {

		String cellTxt = null;
		try {
			List<WebElement> listTR = getRowsList();
			// List<WebElement>
			// listTD_TH=listTR.get(rowNum-1).findElements(By.cssSelector("th,td"));
			List<WebElement> listTD_TH = listTR.get(rowNum - 1).findElements(By.xpath("th|td"));
			WebElement cellObj = listTD_TH.get(colNum - 1);
			//webUtil.javaScript_ScrollIntoMIDDLEView_AndHighlight(cellObj);
			//SnapshotManager.takeSnapShot("getCellText()");
			cellTxt = cellObj.getText().replace("\r\n", " ").replace("\n", " ");
		} catch (Exception e) {
			//new CustomExceptionHandler(e);
		}
		return cellTxt;
	}

	/**
	 * use this method to get the WebElement Object(<td>) pointed by rowNum
	 * and colNum. This method is useful when we want to apply getAttribute 
	 * method on the Table cell itself.
	 *  
	 * @param rowNum
	 *            The Row number of cell
	 * @param colNum
	 *            The Column number of cell
	 * @return The WebElement Object, and in case of
	 *         exception will return null
	 */
	public WebElement getCellObject(int rowNum, int colNum) {
		WebElement cell = null;
		try {
			List<WebElement> listTR = getRowsList();
			// List<WebElement>
			//listTD_TH = listTR.get(rowNum - 1).findElements(By.cssSelector("th,td"));
			List<WebElement> listTD_TH=listTR.get(rowNum-1).findElements(By.xpath("th|td")); 
			WebElement cellObj = listTD_TH.get(colNum - 1);
			//webUtil.javaScript_ScrollIntoMIDDLEView_AndHighlight(cellObj);
			cell = cellObj;
		} catch (Exception e) {
			//new CustomExceptionHandler(e);
		}
		return cell;
	}


	/**
	 * use this method to get the List of WebElements matching the passed
	 * Tag(for e.g. "img","a" etc) present in the cell(pointed by passed row and
	 * col num)
	 * 
	 * @param rowNum
	 *            The Row number of cell
	 * @param rowNum
	 *            The Column number of cell
	 * @param tag
	 *            The tag of desired webelement, it could be any valid html tag,
	 *            common examples are "a","img".
	 * @return The matching tags inside the passed cell, it will skip all
	 *         hierarchy and fetch the desired objects list, and in case of
	 *         exception will return null
	 */
	public List<WebElement> getChildObjects(int rowNum, int colNum, String tag) {

		List<WebElement> childObjects = null;
		try {
			List<WebElement> listTR = getRowsList();
			// List<WebElement>
			// listTD_TH=listTR.get(rowNum-1).findElements(By.cssSelector("th,td"));
			List<WebElement> listTD_TH = listTR.get(rowNum - 1).findElements(By.xpath("th|td"));
			childObjects = listTD_TH.get(colNum - 1).findElements(By.tagName(tag));
		} catch (Exception e) {
			//new CustomExceptionHandler(e);
		}
		return childObjects;
	}

	/**
	 * use this method to get the single WebElement matching the passed Tag(for
	 * e.g. "img","a" etc) present in the cell(pointed by passed row and col
	 * num) based on passed index
	 * 
	 * @param rowNum
	 *            The Row number of cell
	 * @param rowNum
	 *            The Column number of cell
	 * @param tag
	 *            The tag of desired webelement, it could be any valid html tag,
	 *            common examples are "a","img".
	 * @param index
	 *            The index of desired webelement from the list, index starts
	 *            with 0
	 * @return The element which is present on the passed index, matching the
	 *         tag in a cell pointed by passed row and col nums, and in case of
	 *         exception will return null
	 */
	public WebElement getChildObject(int rowNum, int colNum, String tag, int index) {

		WebElement childObject = null;
		try {
			List<WebElement> listTR = getRowsList();
			// List<WebElement>
			// listTD_TH=listTR.get(rowNum-1).findElements(By.cssSelector("th,td"));
			List<WebElement> listTD_TH = listTR.get(rowNum - 1).findElements(By.xpath("th|td"));
			childObject = listTD_TH.get(colNum - 1).findElements(By.tagName(tag)).get(index);
			//webUtil.javaScript_ScrollIntoMIDDLEView_AndHighlight(getCellObject(rowNum, colNum));
		} catch (Exception e) {
			//new CustomExceptionHandler(e);
		}
		return childObject;
	}

	/**
	 * use this method to get the count of WebElements matching the passed
	 * Tag(for e.g. "img","a" etc) present in the cell(pointed by passed row and
	 * col num)
	 * 
	 * @param rowNum
	 *            The Row number of cell
	 * @param rowNum
	 *            The Column number of cell
	 * @param tag
	 *            The tag of desired webelement, it could be any valid html tag,
	 *            common examples are "a","img".
	 * @return The count of webelement, matching the tag in a cell pointed by
	 *         passed row and col nums, and in case of exception will return -1
	 */
	public int getChildObjectsCount(int rowNum, int colNum, String tag) {

		int childObjectsCount = -1;
		try {
			List<WebElement> listTR = getRowsList();
			// List<WebElement>
			// listTD_TH=listTR.get(rowNum-1).findElements(By.cssSelector("th,td"));
			List<WebElement> listTD_TH = listTR.get(rowNum - 1).findElements(By.xpath("th|td"));
			if(colNum<=getColCount(rowNum)){
				String innerHTML=listTD_TH.get(colNum - 1).getAttribute("innerHTML");
				if(innerHTML.contains(tag)){
					childObjectsCount = listTD_TH.get(colNum - 1).findElements(By.tagName(tag)).size();	
				}
			}
		} catch (Exception e) {
			//new CustomExceptionHandler(e);
		}
		return childObjectsCount;
	}

	/**
	 * use this method to get the Row number which has the passed text value
	 * 
	 * @param visibleTxt
	 *            The visible text, for which the row count is needed to be
	 *            found
	 * @return The first row number that has the text which matches the passed
	 *         parameter value, and in case of exception will return -1
	 * 
	 */
	public int getRowWithCellText(String visibleTxt) {
		int rowNum = -1;
		String temp="";
		try {
			List<WebElement> listTR = getRowsList();
			for (int row = 0; row < listTR.size(); row++) {
				temp = listTR.get(row).getText();
				if (temp.toLowerCase().contains(visibleTxt.toLowerCase())) {
					rowNum = row+1;
					break;
				}
			}
		} catch (Exception e) {
			//new CustomExceptionHandler(e);
		}
		return rowNum;
	}


	/**
	 * use this method to get the Row number which has the passed text value
	 * 
	 * @param startRow
	 *            the begin row count, inclusive.
	 * @param visibleTxt
	 *            The visible text, for which the row count is needed to be
	 *            found
	 * @return The first row number that has the text which matches the passed
	 *         parameter value, and in case of exception will return -1
	 * 
	 */
	public int getRowWithCellText(int startRow,String visibleTxt) {
		int rowNum = -1;
		String temp="";
		try {
			List<WebElement> listTR = getRowsList();
			for (int row = startRow-1; row < listTR.size(); row++) {
				temp = listTR.get(row).getText();
				if (temp.toLowerCase().contains(visibleTxt.toLowerCase())) {
					rowNum = row+1;
					break;
				}
			}
		} catch (Exception e) {
			//new CustomExceptionHandler(e);
		}
		return rowNum;
	}

	/** Call getColumnNumber method after running this method
	 * @headerRow Starts with 1
	 * */
	private List<String> headerColumnList;
	public WebTable initHeaderColumnList(int headerRow) {
		try{
			headerColumnList= new ArrayList<String>();
			List<WebElement> listTR = getRowsList();
			List<WebElement> thList=listTR.get(headerRow-1).findElements(By.xpath("th|td"));
			for (WebElement temp : thList) {
				//webUtil.javaScript_ScrollIntoMIDDLEView_AndHighlight(temp);
				headerColumnList.add(temp.getText().replace("\r\n", " ").replace("\n", " "));
			}
		} catch (Exception e) {
			System.out.println("initHeaderColumnList() method failed for headerRow "+headerRow+" in table "+locator+" <br/><br/> Exception message "+e.getMessage());
			//new CustomExceptionHandler(e);
		}
		return this;
	}

	/** Call initHeaderColumnList method prior to calling this method
	 * @return -1 if column name is not found
	 * */
	public int getColumnNumber(String colName) {
		int foundColNum=-1;
		try{
			if(headerColumnList!=null){
				for (int colNum = 0; colNum < headerColumnList.size(); colNum++) {
					if(headerColumnList.get(colNum).equalsIgnoreCase(colName)){
						foundColNum=colNum+1;
						break;
					}
				}
			}else{
				System.err.println("Call InitColumnHeader method first");
			}
		} catch (Exception e) {
			//new CustomExceptionHandler(e);
		}

		if (foundColNum==-1) {
			System.out.println("Passed Column ["+colName+"] is not found in column header list "+headerColumnList);
		}

		return foundColNum;
	}
	
	/**
	 * From multiple list of WebElement, when only one is Clickable/visible. This method will 
	 * return that element.  
	 * 
	 * Lets say from the list first few are not Clickable/visible, then this method will wait 
	 * for 0 second for each non-interactable element. and once the one element is found 
	 * which is clickable/visible. It will return that
	 * 
	 * Note: This method will return the "first" interactable element.
	 * 
	 * @param element Can be WebElement/By Object, whose locator is finding multiple 
	 * 			elements on the web page. and only one is displayed at a time
	 * 
	 * @return WebElement which are clickable/visible and with which Interaction is possible
	 *
	 */
	public WebElement getInteractableWebElementFromList(Object element) {
		WebElement elem = null;
		try{
			// Getting byObject from the passed element object, so that we can
			// apply findElements method on it
			By byObj = null;
			if (element instanceof By) {
				byObj = (By) element;
			} else if (element instanceof WebElement) {
				//byObj =  getByObjectFromWebElement((WebElement) element);
			}

			/* Applying the findElements method, to get all the web elements who
			 * have the same By Object
			 */
			List<WebElement> list=driver.findElements(byObj);
			WebDriverWait wait=new WebDriverWait(driver, 0);
			
			// Looping through all web element objects to get the first
			// interactive element, by applying the checks 
			for (WebElement webElement : list) {
				
				//Checking WebElement is clickable or not
				try{
					elem=wait.until(ExpectedConditions.elementToBeClickable(webElement));
					break;
				}catch (Exception e) {}

				// Checking that an element, known to be present on the
				// DOM of a page, isvisible. Visibility means that the element
				// is not only displayed but also has a height and width that is
				// greater than 0.
				try{
					elem=wait.until(ExpectedConditions.visibilityOf(webElement));
					break;
				}catch (Exception e) {}
				
				// Checking that an element has a height and width that is
				// greater than 0.
				try{
					int height = webElement.getSize().getHeight();
					int width = webElement.getSize().getWidth();
					if(height > 0 && width > 0){
						elem = webElement;
						break;
					}
				}catch (Exception e) {}
				
			}
			
			// Even after performing the above clickability and visibility
			// checks, due to some issue elem can be null, so in that case we
			// are throwing exception with all relevant details, this will 
			// enhance the traceability of the actual issue 
			if(elem == null){
				System.out.println("getInteractableWebElementFromList() method: Element is null, By Object [" + byObj
								+ "] and size of webElements list [" + list.size() + "]");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return elem;
	}

	
}
