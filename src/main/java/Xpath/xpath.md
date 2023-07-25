

# Samples of complex xpaths

## To get the index of matching element
```
$x("//div[contains(@class,'ng-scope section-right')][count(//span[contains(@class,'title')]/a[contains(@data-id,'profile')][.='John Test']//preceding::div[@info='provider'])+1]")
```

## To perform the case insensitive element search
```
$x("//a[translate(.,'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz')='john test']")
```

## To perform search on data by replacing some text
```
$x("//span[@class='a-price']//span[@class='a-price-whole'][translate(.,',','')<'9999']")
```


