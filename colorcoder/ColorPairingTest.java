package colorcoder;

 class ColorPairingTest {

   void testNumberToPair(int pairNumber,
      MajorColor expectedMajor,
      MinorColor expectedMinor)
  {
      ColorPair colorPair = new ColorPairing().getColorPairFromPairNumber(pairNumber);
      System.out.println("Got pair " + colorPair.getColorPairString());
      assert(colorPair.getMajor() == expectedMajor);
      assert(colorPair.getMinor() == expectedMinor);
  }


  void testPairToNumber(
      MajorColor major,
      MinorColor minor,
      int expectedPairNumber)
  {
      int pairNumber =  new ColorPairing().getPairNumberFromColorPair(major, minor);
      System.out.println("Got pair number " + pairNumber);
      assert(pairNumber == expectedPairNumber);
  }

}
