import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlOption;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlSelect;


public class Main {
	private WebClient webClient;
	 
	//@Before
	public void init() throws Exception {
	    webClient = new WebClient();
	}
	 
	//@After
	/*public void close() throws Exception {
	    webClient.close();
	}*/
	 
	//@Test
	public void givenAClient_whenEnteringBaeldung_thenPageTitleIsOk()
	  throws Exception {
	    HtmlPage page = webClient.getPage("/");
	     
	System.out.println(page.getTitleText());
	   /* Assert.assertEquals(
	      "Baeldung | Java, Spring and Web Development tutorials",
	        page.getTitleText());*/
	}
}
