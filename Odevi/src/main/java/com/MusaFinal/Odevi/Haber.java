package com.MusaFinal.Odevi;

/**
 * 
 *
 * @author musasysal
 * @version 1.0.0
 * @since  201858-01-31
 */

public class Haber {
	public static int COUNT = -1;
	public int id;
	public String haberAdi;
	public String haberIcerik;
	
	/**
	 *@param haberBasligi Stringi Restservislerde olusturdugumuz haber basligini burdan ceker.
     *@param haberIcerik Stringi Restservislerde olusturdugumuz haber basligini burdan ceker.
	 */
	
	public Haber(String haberAdi,String haberIcerik)
	{
		this.id = ++COUNT;
		this.haberAdi=haberAdi;
		this.haberIcerik=haberIcerik;
	}
	/**
	 * Mevcut haber adini Return Eder.
	 */
	
	public String HaberAdi() {
		return haberAdi;
	}
	
	/**
	 * Girilen haber icerigini Return Eder..
	 */
	
	public String getHaberIcerik() {
		return haberIcerik;
	}
	
	/**
	 * id'yi Return Eder..
	 */
	
	public int getId() {
		return id;
	}
	
	

}
