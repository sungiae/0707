package com.sist.lang;
/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class MainClass1 {

	public static void main(String[] args) {
		/*
		String data="¿À´Ã ±¹¹Î ¿©·¯ºĞµé²²¼­µµ ÁüÀÛÇÏ½Ã°Ú½À´Ï´Ù¸¶´Â ÃÖ±Ù"
				+ " ¿©·¯ °÷¿¡¼­ ¹ß»ıÇÏ°í ÀÖ´Â º¯ÀÌ¹ÙÀÌ·¯½ºÀÇ À¯ÀÔ°ú "
				+ "È®»ê ±×¸®°í ¹ÌÁ¢Á¾ÀÚµé, Æ¯È÷ ÀşÀºÃşÀ» Áß½ÉÀ¸·Î ÀÌ·± ºĞµéÀÇ "
				+ "È°µ¿·®ÀÌ Áõ°¡ÇÏ¸é¼­ µû¸£´Â ¿©·¯ °¡Áö "
				+ "»óÈ²ÀÌ¶ó°í »ı°¢µË´Ï´Ù¸¶´Â ±¹¹Î ¿©·¯ºĞµé²² ´Ù½Ã ÇÑ ¹ø ¾î·Á¿òÀ» "
				+ "³¢ÃÄµå¸± ¼ö¹Û¿¡ ¾ø´Â »óÈ²¿¡ ´ëÇØ¼­ »ç°úµå¸³´Ï´Ù.";
		// matches => Á¤±Ô½Ä => ÀÌ¸ŞÀÏ, IP, ÀüÈ­¹øÈ£ ....
		// ±âº»Çü½Ä - data.matches(" .*  ÀÔ·Â°ª .*  ")
		if(data.matches(".*Á¢Á¾ÀÚ.*")){
			System.out.println("Æ÷ÇÔµÇ¾î ÀÖ½À´Ï´Ù");
		}
		else {
			System.out.println("¹ÌÆ÷ÇÔµÇ¾î ÀÖ½À´Ï´Ù");
		}
		// ¿µ¾î¹®ÀÚ Æ÷ÇÔ data.matches(".*[a-zA-Z].*")
		// ¼ıÀÚ Æ÷ÇÔ data.matches(".*[0-9].*")
		// ÇÑ±Û Æ÷ÇÔ data.matches(".*[°¡-ÆR].*")
		 */
		
		String data="ABCDEFGHIJKLMN";
		for(int i=0; i<data.length();i++) {
			System.out.print(data.charAt(i));
		}
		System.out.println();
		for(int i=data.length()-1; i>0;i--) {
			System.out.print(data.charAt(i));
		}
		System.out.println();
		// reverse¸¦ »ç¿ëÇØµµ ¶È°°ÀÌ µÚÁıÀº °á°ú¸¦ ¾òÀ» ¼ö ÀÖ´Ù
		StringBuffer sb=new StringBuffer(data); // ±×¸²µµ °¡´É
		System.out.println(sb.toString());
		String s=sb.reverse().toString();
		System.out.println(s);
	}

}
