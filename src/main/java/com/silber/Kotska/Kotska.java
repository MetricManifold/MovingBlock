
package com.silber.kotska;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.*;

import com.silber.data.ObjectMan;
import com.silber.object.Rectangle;
import com.silber.object.Triangle;
import com.silber.object.Hexagon;
import com.silber.hsa_ufa.Console;

public class Kotska
{
	public static final int MAX_HEIGHT = 800;
	public static final int MAX_WIDTH = 800;
	public static final int DIM_BUFF = 55;
	public static Console c = new Console(MAX_WIDTH + 55, MAX_WIDTH + 55, "Kotska");

	public static boolean W_down = false;
	public static boolean A_down = false;
	public static boolean S_down = false;
	public static boolean D_down = false;


}