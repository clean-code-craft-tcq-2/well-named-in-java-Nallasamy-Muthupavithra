/*
 * Copyright (c) Robert Bosch GmbH. All rights reserved.
 */
package colorcoder;

class ColorPair {
  private MajorColor majorColor;
  private MinorColor minorColor;
  
  public ColorPair(MajorColor major, MinorColor minor)
  {
      majorColor = major;
      minorColor = minor;
  }
  public MajorColor getMajor() {
      return majorColor;
  }
  public MinorColor getMinor() {
      return minorColor;
  }
  String getColorPairString() {
      String colorPairStr = MajorColor.fromIndex(majorColor.getIndex()).toString();
      colorPairStr += " ";
      colorPairStr += MinorColor.fromIndex(minorColor.getIndex()).toString();
      return colorPairStr;
  }
}