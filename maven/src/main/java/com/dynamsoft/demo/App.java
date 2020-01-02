package com.dynamsoft.demo;

import com.dynamsoft.barcode.*;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Working Directory = " + System.getProperty("user.dir"));
		
        try {
            BarcodeReader br = new BarcodeReader("LICENSE-KEY");          

            TextResult[] results = br.decodeFile("../test.jpg", "");
            if (results == null || results.length == 0) {
                System.out.println("No barcode found");
            } 
            else {
                String pszTemp = String.format("Total barcode(s) found: %d.", results.length);
                System.out.println(pszTemp);
                int iIndex = 0;
                for (TextResult result : results) {
                    iIndex++;
                    pszTemp = String.format("  Barcode %d:", iIndex);
                    System.out.println(pszTemp);
                    pszTemp = String.format("    Page: %d", result.localizationResult.pageNumber + 1);
                    System.out.println(pszTemp);
                    pszTemp = "    Type: " + result.barcodeFormatString;
                    System.out.println(pszTemp);
                    pszTemp = "    Value: " + result.barcodeText;
                    System.out.println(pszTemp);

                    pszTemp = String.format("    Region points: {(%d,%d),(%d,%d),(%d,%d),(%d,%d)}",
                            result.localizationResult.resultPoints[0].x, result.localizationResult.resultPoints[0].y,
                            result.localizationResult.resultPoints[1].x,result.localizationResult.resultPoints[1].y,
                            result.localizationResult.resultPoints[2].x,result.localizationResult.resultPoints[2].y,
                            result.localizationResult.resultPoints[3].x,result.localizationResult.resultPoints[3].y);

                    System.out.println(pszTemp);
                    System.out.println();
                }
            }
        } catch (BarcodeReaderException e) {
            e.printStackTrace();
        }
    }
}
