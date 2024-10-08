package project.docmaker.utility.mlogger;


/**
 * ConsoleColor is an enum that stores strings which can be printed into the console to display different colors.
 * <br>
 * These color codes are ANSI codes that can be used to display colors in the console window.
 * <br>
 * <u>Example Usage</u>
 * <br>
 * {@code System.out.print(ConsoleColor.RED);}
 * <br>
 * {@code System.out.print(ConsoleColor.BLACK_BACKGROUND);}
 * <br>
 * {@code System.out.println("Hello World!");}
 * <br>
 * {@code System.out.print(ConsoleColor.RESET);}
 *
 * @author Prof. Dr. Ing. Heiko Mosemann
 * @author Vincent Wolf, Lasse-Leander Hillen, Timothy Hoegen-Jupp, Alexander Goethel
 * @version 1.0.0
 */
public enum ConsoleColor
{
	/**
	 * Represents the ANSI code for a reset content and background color.
	 * <br>
	 * Printing this character resets the printed color to the default color.
	 */
	NORM("\033[0m"),

	/**
	 * Represents the ANSI code for a black content color.
	 */
	BLACK("\033[0;30m"),


	/**
	 * Represents the ANSI code for a red content color.
	 */
	RED("\033[0;31m"),


	/**
	 * Represents the ANSI code for a green content color.
	 */
	GREEN("\033[0;32m"),


	/**
	 * Represents the ANSI code for a yellow content color.
	 */
	YELLOW("\033[0;33m"),


	/**
	 * Represents the ANSI code for a blue content color.
	 */
	BLUE("\033[0;34m"),


	/**
	 * Represents the ANSI code for a magenta content color.
	 */
	MAGENTA("\033[0;35m"),


	/**
	 * Represents the ANSI code for a cyan content color.
	 */
	CYAN("\033[0;36m"),


	/**
	 * Represents the ANSI code for a white content color.
	 */
	WHITE("\033[0;37m"),


	/**
	 * Represents the ANSI code for a black content color with bold formatting.
	 */
	BLACK_BOLD("\033[1;30m"),


	/**
	 * Represents the ANSI code for a red content color with bold formatting.
	 */
	RED_BOLD("\033[1;31m"),


	/**
	 * Represents the ANSI code for a green content color with bold formatting.
	 */
	GREEN_BOLD("\033[1;32m"),


	/**
	 * Represents the ANSI code for a yellow content color with bold formatting.
	 */
	YELLOW_BOLD("\033[1;33m"),


	/**
	 * Represents the ANSI code for a blue content color with bold formatting.
	 */
	BLUE_BOLD("\033[1;34m"),


	/**
	 * Represents the ANSI code for a magenta content color with bold formatting.
	 */
	MAGENTA_BOLD("\033[1;35m"),


	/**
	 * Represents the ANSI code for a cyan content color with bold formatting.
	 */
	CYAN_BOLD("\033[1;36m"),


	/**
	 * Represents the ANSI code for a white content color with bold formatting.
	 */
	WHITE_BOLD("\033[1;37m"),


	/**
	 * Represents the ANSI code for a black content color with underlined formatting.
	 */
	BLACK_UNDERLINED("\033[4;30m"),


	/**
	 * Represents the ANSI code for a red content color with underlined formatting.
	 */
	RED_UNDERLINED("\033[4;31m"),


	/**
	 * Represents the ANSI code for a green content color with underlined formatting.
	 */
	GREEN_UNDERLINED("\033[4;32m"),


	/**
	 * Represents the ANSI code for a yellow content color with underlined formatting.
	 */
	YELLOW_UNDERLINED("\033[4;33m"),


	/**
	 * Represents the ANSI code for a blue content color with underlined formatting.
	 */
	BLUE_UNDERLINED("\033[4;34m"),


	/**
	 * Represents the ANSI code for a magenta content color with underlined formatting.
	 */
	MAGENTA_UNDERLINED("\033[4;35m"),


	/**
	 * Represents the ANSI code for a cyan content color with underlined formatting.
	 */
	CYAN_UNDERLINED("\033[4;36m"),


	/**
	 * Represents the ANSI code for a white content color with underlined formatting.
	 */
	WHITE_UNDERLINED("\033[4;37m"),


	/**
	 * Represents the ANSI code for a black background color.
	 */
	BLACK_BACKGROUND("\033[40m"),


	/**
	 * Represents the ANSI code for a red background color.
	 */
	RED_BACKGROUND("\033[41m"),


	/**
	 * Represents the ANSI code for a green background color.
	 */
	GREEN_BACKGROUND("\033[42m"),


	/**
	 * Represents the ANSI code for a yellow background color.
	 */
	YELLOW_BACKGROUND("\033[43m"),


	/**
	 * Represents the ANSI code for a blue background color.
	 */
	BLUE_BACKGROUND("\033[44m"),


	/**
	 * Represents the ANSI code for a magenta background color.
	 */
	MAGENTA_BACKGROUND("\033[45m"),


	/**
	 * Represents the ANSI code for a cyan background color.
	 */
	CYAN_BACKGROUND("\033[46m"),


	/**
	 * Represents the ANSI code for a white background color.
	 */
	WHITE_BACKGROUND("\033[47m"),


	/**
	 * Represents the ANSI code for a black content color with bright formatting.
	 */
	BLACK_BRIGHT("\033[0;90m"),


	/**
	 * Represents the ANSI code for a red content color with bright formatting.
	 */
	RED_BRIGHT("\033[0;91m"),


	/**
	 * Represents the ANSI code for a green content color with bright formatting.
	 */
	GREEN_BRIGHT("\033[0;92m"),


	/**
	 * Represents the ANSI code for a yellow content color with bright formatting.
	 */
	YELLOW_BRIGHT("\033[0;93m"),


	/**
	 * Represents the ANSI code for a blue content color with bright formatting.
	 */
	BLUE_BRIGHT("\033[0;94m"),


	/**
	 * Represents the ANSI code for a magenta content color with bright formatting.
	 */
	MAGENTA_BRIGHT("\033[0;95m"),


	/**
	 * Represents the ANSI code for a cyan content color with bright formatting.
	 */
	CYAN_BRIGHT("\033[0;96m"),


	/**
	 * Represents the ANSI code for a white content color with bright formatting.
	 */
	WHITE_BRIGHT("\033[0;97m"),


	/**
	 * Represents the ANSI code for a black content color with bold and bright formatting.
	 */
	BLACK_BOLD_BRIGHT("\033[1;90m"),


	/**
	 * Represents the ANSI code for a red content color with bold and bright formatting.
	 */
	RED_BOLD_BRIGHT("\033[1;91m"),


	/**
	 * Represents the ANSI code for a green content color with bold and bright formatting.
	 */
	GREEN_BOLD_BRIGHT("\033[1;92m"),


	/**
	 * Represents the ANSI code for a yellow content color with bold and bright formatting.
	 */
	YELLOW_BOLD_BRIGHT("\033[1;93m"),


	/**
	 * Represents the ANSI code for a blue content color with bold and bright formatting.
	 */
	BLUE_BOLD_BRIGHT("\033[1;94m"),


	/**
	 * Represents the ANSI code for a magenta content color with bold and bright formatting.
	 */
	MAGENTA_BOLD_BRIGHT("\033[1;95m"),


	/**
	 * Represents the ANSI code for a cyan content color with bold and bright formatting.
	 */
	CYAN_BOLD_BRIGHT("\033[1;96m"),


	/**
	 * Represents the ANSI code for a white content color with bold and bright formatting.
	 */
	WHITE_BOLD_BRIGHT("\033[1;97m"),


	/**
	 * Represents the ANSI code for a black background color with bright formatting.
	 */
	BLACK_BACKGROUND_BRIGHT("\033[0;100m"),


	/**
	 * Represents the ANSI code for a black background color with bright formatting.
	 */
	RED_BACKGROUND_BRIGHT("\033[0;101m"),


	/**
	 * Represents the ANSI code for a green background color with bright formatting.
	 */
	GREEN_BACKGROUND_BRIGHT("\033[0;102m"),


	/**
	 * Represents the ANSI code for a yellow background color with bright formatting.
	 */
	YELLOW_BACKGROUND_BRIGHT("\033[0;103m"),


	/**
	 * Represents the ANSI code for a blue background color with bright formatting.
	 */
	BLUE_BACKGROUND_BRIGHT("\033[0;104m"),


	/**
	 * Represents the ANSI code for a magenta background color with bright formatting.
	 */
	MAGENTA_BACKGROUND_BRIGHT("\033[0;105m"),


	/**
	 * Represents the ANSI code for a cyan background color with bright formatting.
	 */
	CYAN_BACKGROUND_BRIGHT("\033[0;106m"),


	/**
	 * Represents the ANSI code for a white background color with bright formatting.
	 */
	WHITE_BACKGROUND_BRIGHT("\033[0;107m");


	/**
	 * The value of the console color. This value gets assigned as soon as an enum entry has been called, as the constructor is invoked automatically as soon as someone uses
	 * an entry from the enum.
	 */
	private final String code;



	/**
	 * Constructs an instance of the ConsoleColor enum entry.
	 *
	 * @param code The console color ANSI string which each enum entry holds as it's first parameter.
	 *
	 * @precondition An ANSI code that represents a color code that can be printed out in the console has to be supplied as a parameter.
	 * @postcondition An instance of this class was constructed.
	 */
	ConsoleColor (final String code)
	{
		this.code = code;
	}



	/**
	 * The code returned here has to be printed into the console to change the color displayed in the console.
	 *
	 * @return The console color as ANSI string.
	 *
	 * @precondition The {@link ConsoleColor#code} is not equal to null.
	 * @postcondition The string representation of the console color code was returned.
	 */
	@Override
	public String toString ()
	{
		return this.code;
	}
}
