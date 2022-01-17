package colorcoder;

 class ColorPairing {
  
  private static final int NUMBER_OF_MINOR_COLORS = MinorColor.values().length;
  
   ColorPair getColorPairFromPairNumber(int pairNumber) {
    int zeroBasedPairNumber = pairNumber - 1;
    MajorColor majorColor = 
        MajorColor.fromIndex(zeroBasedPairNumber / NUMBER_OF_MINOR_COLORS);
    MinorColor minorColor =
        MinorColor.fromIndex(zeroBasedPairNumber % NUMBER_OF_MINOR_COLORS);
    return new ColorPair(majorColor, minorColor);
   }

   int getPairNumberFromColorPair(MajorColor major, MinorColor minor) {
    return major.getIndex() * NUMBER_OF_MINOR_COLORS + minor.getIndex() + 1;
   }
}
