package com.MusaFinal.Odevi;
import java.util.List;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
/**
*@author musasysal
*@version 1.0.0
*Restservislerin bulundugu sinif.
*/

@RestController
public class RESTServis {

    private static final List<Haber> HABERLER = new ArrayList<>();
    

    /**
    *{@code localhost:8080/haber/olustur?haberAdi=Spor&haberIcerik=TransferHaberleri} Yazilarak HABERLER listemize yeni bir haber ekleriz. 
    *@return Olusan Haberi Doner.
    *@param haberAdi kullanicinin girdigi haber adini tutar.
    *@param haberIcerik kullanicinin girdigi haber icerigini tutar.
    *
    */
    @RequestMapping("/haber/olustur")
   	public static Haber haberOlustur(String haberAdi, String haberIcerik) 
   	{
   		Haber haber = new Haber(haberAdi, haberIcerik);
   		HABERLER.add(haber);
   		return haber;
   	}
    
    /**
     *{@code localhost:8080/haber/listele} seklinde erisilir.
     *@return olusturup silinmeyen tum haberleri doner.
     */
    
	@RequestMapping("/haber/listele")
	public static List<Haber> haberListele()
	{
		return HABERLER;
	}
	
	 /**
     *{@code localhost:8080/haber/temizle} seklinde kullanilir
     *Tum haberleri temizlemeye yarar..
     *@return Bütün Haberler Temizlendi ! olarak geri doner.
     */
	
	@RequestMapping("/haber/temizle")
	public static String haberTemizle()
	{
		HABERLER.clear();
		return "Bütün Haberler Temizlendi !";
	}
	
	/**
     *{@code localhost:8080/haber/sil?index=haberId} haberId yazan yere silmek istedigiminiz haberin Id'sini girerek islem yapariz.
     *Girilen indexteki haberi silmeye yarar.
     *@return "Belirlenen indexteki haber silindi." olarak geri doner.
     */
	

	@RequestMapping("/haber/sil")
	public static String haberSil(int index)
	{
		HABERLER.remove(index);
		return "Belirlenen indexteki haber silindi";
	}	
}



