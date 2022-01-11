package colorcoder;

class ColorCoder {

    

    /**
     * @param args
     */
    public static void main(String[] args) {
      ColorPairingTest  colorCodingTest = new ColorPairingTest();
        colorCodingTest.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
        colorCodingTest.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);
    
        colorCodingTest.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
        colorCodingTest.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
        
        new ColorCoder().printColorCodeManual();
    }


      void printColorCodeManual() {
            System.out.println("----25 Pair Color Code ----");
            System.out.println("Pair Number - Major Color Minor Color");
            for(int pairNo = 1 ; pairNo <= 25 ; pairNo++) {
              ColorPair colorPair = new ColorPairing().getColorPairFromPairNumber(pairNo);
              System.out.println(pairNo + "-" + colorPair.getColorPairString());            
            }
    }
}
