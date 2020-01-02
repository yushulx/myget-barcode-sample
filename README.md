# MyGet Barcode Sample

The repository shares how to install Dynamsoft Barcode Reader from MyGet and use the SDK in different programming languages.

## License Key
Get the [free trial license key](https://www.dynamsoft.com/CustomerPortal/Portal/Triallicense.aspx).

## Python
Install:

```
pip install –index-url https://www.myget.org/F/dynamsoft/python/ dbr
```

Set the license key:

```
dbr.InitLicense(license)
```

Run the app:

```
python test.py
```

## NPM

Install dynamsoft-javascript-barcode:

```
npm set registry https://www.myget.org/F/dynamsoft/npm/
npm install dynamsoft-javascript-barcode
```

Set the license:

```
<script src="node_modules/dynamsoft-javascript-barcode/dist/dbr.js"
        data-productKeys="LICENSE-KEY"></script>
```

Host the HTML file with [Web Server for Chrome](https://chrome.google.com/webstore/detail/web-server-for-chrome/ofhbbkphhbklhfoeikjpcbhemlocgigb?hl=en).

## NuGet

Import the project to Visual Studio 2017.

Set the license key:

```
mBarcodeReader = new BarcodeReader("LICENSE-KEY");
```

Press `F5` to run the app.

## Maven

Install [Maven](https://maven.apache.org/download.cgi).

Import the project to `Visual Studio Code`.

Set the license key:

```
BarcodeReader br = new BarcodeReader("LICENSE-KEY");         
```

Press F5 to run the app.
