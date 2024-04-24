/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose">
 *   Copyright (c) 2021 Aspose.Tasks Cloud
 * </copyright>
 * <summary>
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------
 */

package com.aspose.tasks.cloud.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * 
 */
@JsonAdapter(Colors.Adapter.class)
public enum Colors {
  
  MEDIUMAQUAMARINE("MediumAquamarine"),
  
  MEDIUMBLUE("MediumBlue"),
  
  MEDIUMORCHID("MediumOrchid"),
  
  MEDIUMPURPLE("MediumPurple"),
  
  MEDIUMSEAGREEN("MediumSeaGreen"),
  
  MEDIUMSLATEBLUE("MediumSlateBlue"),
  
  MEDIUMSPRINGGREEN("MediumSpringGreen"),
  
  MAROON("Maroon"),
  
  MEDIUMTURQUOISE("MediumTurquoise"),
  
  MIDNIGHTBLUE("MidnightBlue"),
  
  MINTCREAM("MintCream"),
  
  MISTYROSE("MistyRose"),
  
  MOCCASIN("Moccasin"),
  
  NAVAJOWHITE("NavajoWhite"),
  
  NAVY("Navy"),
  
  OLDLACE("OldLace"),
  
  MEDIUMVIOLETRED("MediumVioletRed"),
  
  MAGENTA("Magenta"),
  
  LINEN("Linen"),
  
  LIMEGREEN("LimeGreen"),
  
  LAVENDERBLUSH("LavenderBlush"),
  
  LAWNGREEN("LawnGreen"),
  
  LEMONCHIFFON("LemonChiffon"),
  
  LIGHTBLUE("LightBlue"),
  
  LIGHTCORAL("LightCoral"),
  
  LIGHTCYAN("LightCyan"),
  
  LIGHTGOLDENRODYELLOW("LightGoldenrodYellow"),
  
  LIGHTGRAY("LightGray"),
  
  LIGHTGREEN("LightGreen"),
  
  LIGHTPINK("LightPink"),
  
  LIGHTSALMON("LightSalmon"),
  
  LIGHTSEAGREEN("LightSeaGreen"),
  
  LIGHTSKYBLUE("LightSkyBlue"),
  
  LIGHTSLATEGRAY("LightSlateGray"),
  
  LIGHTSTEELBLUE("LightSteelBlue"),
  
  LIGHTYELLOW("LightYellow"),
  
  LIME("Lime"),
  
  OLIVE("Olive"),
  
  OLIVEDRAB("OliveDrab"),
  
  ORANGE("Orange"),
  
  ORANGERED("OrangeRed"),
  
  SILVER("Silver"),
  
  SKYBLUE("SkyBlue"),
  
  SLATEBLUE("SlateBlue"),
  
  SLATEGRAY("SlateGray"),
  
  SNOW("Snow"),
  
  SPRINGGREEN("SpringGreen"),
  
  STEELBLUE("SteelBlue"),
  
  TAN("Tan"),
  
  TEAL("Teal"),
  
  THISTLE("Thistle"),
  
  TOMATO("Tomato"),
  
  TRANSPARENT("Transparent"),
  
  TURQUOISE("Turquoise"),
  
  VIOLET("Violet"),
  
  WHEAT("Wheat"),
  
  WHITE("White"),
  
  WHITESMOKE("WhiteSmoke"),
  
  SIENNA("Sienna"),
  
  LAVENDER("Lavender"),
  
  SEASHELL("SeaShell"),
  
  SANDYBROWN("SandyBrown"),
  
  ORCHID("Orchid"),
  
  PALEGOLDENROD("PaleGoldenrod"),
  
  PALEGREEN("PaleGreen"),
  
  PALETURQUOISE("PaleTurquoise"),
  
  PALEVIOLETRED("PaleVioletRed"),
  
  PAPAYAWHIP("PapayaWhip"),
  
  PEACHPUFF("PeachPuff"),
  
  PERU("Peru"),
  
  PINK("Pink"),
  
  PLUM("Plum"),
  
  POWDERBLUE("PowderBlue"),
  
  PURPLE("Purple"),
  
  RED("Red"),
  
  ROSYBROWN("RosyBrown"),
  
  ROYALBLUE("RoyalBlue"),
  
  SADDLEBROWN("SaddleBrown"),
  
  SALMON("Salmon"),
  
  SEAGREEN("SeaGreen"),
  
  YELLOW("Yellow"),
  
  KHAKI("Khaki"),
  
  CYAN("Cyan"),
  
  DARKMAGENTA("DarkMagenta"),
  
  DARKKHAKI("DarkKhaki"),
  
  DARKGREEN("DarkGreen"),
  
  DARKGRAY("DarkGray"),
  
  DARKGOLDENROD("DarkGoldenrod"),
  
  DARKCYAN("DarkCyan"),
  
  DARKBLUE("DarkBlue"),
  
  IVORY("Ivory"),
  
  CRIMSON("Crimson"),
  
  CORNSILK("Cornsilk"),
  
  CORNFLOWERBLUE("CornflowerBlue"),
  
  CORAL("Coral"),
  
  CHOCOLATE("Chocolate"),
  
  DARKOLIVEGREEN("DarkOliveGreen"),
  
  CHARTREUSE("Chartreuse"),
  
  BURLYWOOD("BurlyWood"),
  
  BROWN("Brown"),
  
  BLUEVIOLET("BlueViolet"),
  
  BLUE("Blue"),
  
  BLANCHEDALMOND("BlanchedAlmond"),
  
  BLACK("Black"),
  
  BISQUE("Bisque"),
  
  BEIGE("Beige"),
  
  AZURE("Azure"),
  
  AQUAMARINE("Aquamarine"),
  
  AQUA("Aqua"),
  
  ANTIQUEWHITE("AntiqueWhite"),
  
  ALICEBLUE("AliceBlue"),
  
  CADETBLUE("CadetBlue"),
  
  DARKORANGE("DarkOrange"),
  
  YELLOWGREEN("YellowGreen"),
  
  DARKRED("DarkRed"),
  
  INDIGO("Indigo"),
  
  INDIANRED("IndianRed"),
  
  DARKORCHID("DarkOrchid"),
  
  HONEYDEW("Honeydew"),
  
  GREENYELLOW("GreenYellow"),
  
  GREEN("Green"),
  
  GRAY("Gray"),
  
  GOLDENROD("Goldenrod"),
  
  GOLD("Gold"),
  
  GHOSTWHITE("GhostWhite"),
  
  GAINSBORO("Gainsboro"),
  
  FUCHSIA("Fuchsia"),
  
  FORESTGREEN("ForestGreen"),
  
  HOTPINK("HotPink"),
  
  FIREBRICK("Firebrick"),
  
  FLORALWHITE("FloralWhite"),
  
  DODGERBLUE("DodgerBlue"),
  
  DIMGRAY("DimGray"),
  
  DEEPSKYBLUE("DeepSkyBlue"),
  
  DEEPPINK("DeepPink"),
  
  DARKVIOLET("DarkViolet"),
  
  DARKTURQUOISE("DarkTurquoise"),
  
  DARKSLATEGRAY("DarkSlateGray"),
  
  DARKSLATEBLUE("DarkSlateBlue"),
  
  DARKSEAGREEN("DarkSeaGreen"),
  
  DARKSALMON("DarkSalmon");

  private String value;

  Colors(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Colors fromValue(String text) {
    for (Colors b : Colors.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<Colors> {
    @Override
    public void write(final JsonWriter jsonWriter, final Colors enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Colors read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Colors.fromValue(String.valueOf(value));
    }
  }
}

