package com.sist.lang;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

class FoodHouse
{
	// 蔦酋鉢 
	private int rank;
	private String name;
	private String address;
	private double score;
	private String review;
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	
}
/*
 *   <figcaption>
                      <div class="info">
                        <div class="wannago_wrap">
                          <button class="btn-type-icon favorite wannago_btn "
                                  data-restaurant_uuid="13357"
                                  data-action_id="">
                          </button>
                          <p class="wannago_txt">亜壱粛陥 </p>
                        </div>
                        <span class="title ">
                          <a href="/restaurants/aeO_cG35KO"
                             onclick="trackEvent('CLICK_RESTAURANT', {&quot;position&quot;:0,&quot;restaurant_key&quot;:&quot;aeO_cG35KO&quot;})">
                            1.<h3> 鳶什闘軒採銅滴</h3>
                          </a>
                        </span>
                        <strong class="point  ">
                          <span>4.7 </span>
                        </strong>
                        <p class="etc ">辞随働紺獣 掻姥 疑硲稽 249 辞随重虞硲土 1F</p>
                      </div>
                    </figcaption>
                  </figure>
                    <div class="review-content no-bottom">
                      <figure class="user">
                        <div class="thumb lazy"
                             data-original="https://s3-ap-northeast-1.amazonaws.com/img.prod.mp/9239_1447128966860?fit=around|56:56&amp;crop=56:56;*,*&amp;output-format=jpg&amp;output-quality=80"
                             data-error="https://mp-seoul-image-production-s3.mangoplate.com/web/resources/jmcmlp180qwkp1jj.png?fit=around|*:*&amp;crop=*:*;*,*&amp;output-format=jpg&amp;output-quality=80">
                        </div>
                        <figcaption class="">
                          慎姥薩
                        </figcaption>
                      </figure>
                      <p class="short_review " onclick="trackEvent('CLICK_FEATURED_REVIEW')" data-restaurant_key="aeO_cG35KO" data-is_long_reivew="
                        true
                        ">
                          煽 慎荊廃 舘檎戚 左戚獣蟹慎.. 是拭 赤澗 諺壱亀 伐筈廃汽 追戚庭 紫戚紫戚拭亀 煽係惟 諺壱亜 弦岩艦雁ばば 拙鰍拭 股壱 粛醸澗汽 獣草聖 兜団亜走壱...
                      </p>
                      <p class="long_review ">
                        煽 慎荊廃 舘檎戚 左戚獣蟹慎.. 是拭 赤澗 諺壱亀 伐筈廃汽 追戚庭 紫戚紫戚拭亀 煽係惟 諺壱亜 弦岩艦雁ばば 拙鰍拭 股壱 粛醸澗汽 獣草聖 兜団亜走壱 公 股醸陥澗 十蚤 紫尻.. 臣背澗 蹟走 省壱 薦凶 達焼穐柔艦陥推ぞぞぞ 益掘亀 追斥左陥澗 桜呪亜 希 言赤陥澗 剰奄亜 弦焼辞 繕榎 旗 奄企研 背辞 益訓姶.. 糎言妬姥軒!!!!!!!!!!! 追斥拭 戚係惟 壱禎 諺壱亜 臣虞亜澗惟 源戚 桔艦猿ばば
                      </p>
                        <span class="review_more_btn" onclick="trackEvent('CLICK_MORE_REVIEW', {&quot;position&quot;:0,&quot;restaurant_key&quot;:&quot;aeO_cG35KO&quot;})">希左奄</span>
                    </div>
 */
public class 掘遁適掘什誓遂 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        FoodHouse[] fh=new FoodHouse[10];
        try
        {
        	Document doc=Jsoup.connect("https://www.mangoplate.com/top_lists/2849_fruitdessert").get();
        	//System.out.println(doc);
        	// <span> => 殿益 => 切郊(Element)
        	Elements span=doc.select("span.title");
        	Elements strong=doc.select("strong.point");
        	Elements addr=doc.select("p.etc");
        	Elements review=doc.select("p.short_review");
        	/*
        	 *      1. 鳶什闘軒採銅滴
					2. 敢水澱獣巨煽闘
					3. 希虞戚崎君軒
					4. 珠塘
					5. 星獣追戚滴
					6. 10杉19析
					7. 督継裳櫛益
					8. 壱什闘推暗闘
					9. 攻叔戚至亀
					10. 呪雌廃畠朝凪
        	 */
        	for(int i=0;i<10;i++)
        	{
        		//System.out.println(span.get(i).text());
        		String etc=span.get(i).text();
        		String rank=etc.substring(0,etc.indexOf("."));// .蒋拭辞 
        		String name=etc.substring(etc.indexOf(".")+1);// .及拭辞 
        		  //etc.replaceAll("[^0-9]", "");
        		//System.out.println(rank);
        		// rank研 舛呪稽 痕井
        		int k=Integer.parseInt(rank); 
        		System.out.println(name.trim());
        		System.out.println(Double.parseDouble(strong.get(i).text()));
        		// strong.get(i).text() => String
        		// Double.parseDouble(strong.get(i).text()) => double
        		System.out.println(addr.get(i).text());
        		System.out.println(review.get(i).text());
        		System.out.println("===========================================");
        		// 崎虞酔煽稽 穿勺 
        		// Wrapper適掘什 => String聖 背雁 汽戚斗莫生稽 痕井 爽稽 紫遂 
        		/*
        		 *   parseInt()  <=====>  valueOf() : 切郊=>崎虞酔煽稽 穿勺 
        		 *   parseDouble() <=====> valueOf()
        		 *   parseLong()  <=======> valueOf()
        		 *   parseBoolean() <======> valueOf()
        		 *   
        		 *   String hit="1"
        		 *     => hit+=1 ===> "111111111111"
        		 *   int hit=1;
        		 *     => hit+=1 ==> 2
        		 */
        	}
        }catch(Exception ex)
        {
        	ex.printStackTrace();//拭君 坦軒 
        }
	}

}
