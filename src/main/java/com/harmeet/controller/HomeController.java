package com.harmeet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String defaultpage(Model m) {
		m.addAttribute("title","Website Designing Company in Raipur");
		return "home";
	}
	
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String view(Model m) {
		m.addAttribute("title","Website Designing Company in Raipur");
		return "home";
	}
	@RequestMapping(value="Portfolio",method=RequestMethod.GET)
	public String portfoliopage(Model m) {
		m.addAttribute("title", "PortFolio-Ksitsolution");
		return "portfolio";
	}
//	@RequestMapping(value="form-submit",method=RequestMethod.POST)
//	public String formsubmit(@ModelAttribute KScontact contact , HttpSession session,Model m)
//	{	
//		String currentEmail = contact.getEmail();
//        long i=this.repository.getUserByUserName(currentEmail);
//		if(i>0) {
//			m.addAttribute("msg", "Email already exist pls try again");
//			m.addAttribute("m1", "color:orange;font-size:14px;margin-left:30px");
//			System.out.println("Not saving the data");
//		}
//		else {
////			this.repository.save(contact);
//			m.addAttribute("msg", "Msg send successfully");
//			m.addAttribute("m1", "color:green;font-size:14px;margin-left:30px");
//			System.out.println("saving data in database");
//		}
//		
//		return "home";
//	}
	
	@RequestMapping(value="services/mobile-app-development",method=RequestMethod.GET)
	public String appPage(Model m) {
		m.addAttribute("title"," Mobile App Development Company in raipur | Mobile App Developer in Raipur | App Developer in Raipur");
		m.addAttribute("metadesc","Best Mobile Application Company in Raipur, App Development, Software Development Website Designing in Raipur, Mobile App development company in Raipur, Web Development company in Raipur");
		m.addAttribute("metatags","Mobile app in Raipur, App Development in Raipur , Mobile Appication Development, Website Designing Company in Chhattisgarh ,Web designing company in raipur ");
		return "mobileapp";
	}
	@RequestMapping(value="services/Website-Designing-Company-Raipur",method=RequestMethod.GET)
	public String websitePage(Model m) {
		m.addAttribute("title","Website Designing Company in Raipur | Web Designer in Raipur | KSITSOLUTION ");
		m.addAttribute("area","Raipur");
		m.addAttribute("metadesc","Best Website Designing Company in Raipur, Which focuses on developing a website which is best in design and also SEO friendly in Raipur, Designer in Raipur ");
		m.addAttribute("metatags","Web Design in Raipur, Website Development in Raipur, Website Design in Raipur, Best Website Design and Development in Raipur");
 	    return "webdesign";
	}
	@RequestMapping(value="services/website-design-and-development",method=RequestMethod.GET)
		public String websitedesginpage(Model m) {
			return "websitedesigning";
	}
	@RequestMapping(value="services/E-commerce",method=RequestMethod.GET)
	public String Ecommercepage(Model m) {
		return "Ecommerce";
    } 
	@RequestMapping(value="services/software-development",method=RequestMethod.GET)
	public String softwarePage(Model m) {
		m.addAttribute("title","Software Development Company in Raipur | Desktop Application | Web Application ");
		m.addAttribute("metadesc","Best Software Company in Raipur, Web Application, Software Design in Raipur, Mobile Application company in Raipur, Web Development company in Raipur");
		m.addAttribute("metatags"," software development in raipur, software development in chhattisgarh, IT solution company in raipur, website seo in raipur,seo in raipur,seo in chhattisgarh, website design in raipur, Web Development Raipur, website designing in raipur, Responsive website in raipur");
		return "software";
	}
	@RequestMapping(value="services/graphic-designing",method=RequestMethod.GET)
	public String GraphicPage(Model m) {
		m.addAttribute("title","Graphic Designing Company in Raipur | Logo Design | Poster Design | Banner Design  ");
		m.addAttribute("metadesc","Best Graphic Designing Company in Raipur, We are experts in Designing Logo,Flyers,Banners,Posters, at very low cost, Creative Web Design in Raipur,");
		m.addAttribute("metatags","Graphic Company in Raipur,Graphic Design in Raipur , Logo Desig in Raipur, Posters Design in Raipur ,Flyers Design in raipur, web designing company in chhattisgarh, Graphic Designing Company in Chhattisgarh, Graphic Designing Company in Raipur");
		return "graphic";
	}
	@RequestMapping(value="about",method=RequestMethod.GET)
	public String AboutusPage(Model m) {
		m.addAttribute("title","About - Fully SEO Based Website at Low Cost in Raipur| our website policy");
		m.addAttribute("metadesc","KSITSOLUTION Company is the Best Website Designing and Development Company in Raipur With the MOTO of changing the Mindset of people towards website we target more on making a website SEO that will help new people to find the online easily and generate more leads");
		m.addAttribute("metatags","About KSITSOLUTION ? Small Description of KSITSOLUTION");
		return "aboutus";
	}
	@RequestMapping(value="contact",method=RequestMethod.GET)
	public String ContactusPage(Model m) {
		m.addAttribute("title", "Website & Mobile App Development Company in Choubey Colony");
		m.addAttribute("metadesc","KSITSOLUTION add-choubey colony 8435999567 call us now for free inquiry");
		m.addAttribute("metatags","Contact KSITSOLUTION now for more details, ");
		return "contact";
	}
	@RequestMapping(value="whychooseus",method=RequestMethod.GET)
	public String whychooseus(Model m) {
		m.addAttribute("title", " Website & App Development Company contact details | software development | graphic designing ");
		return "whychoose";
	}
	@RequestMapping(value="services",method=RequestMethod.GET)
	public String services(Model m) {
		m.addAttribute("title", " Website Development | Mobile apps | Graphic Designing | Software Development");
		m.addAttribute("metadesc","Best Website Designing Company in Raipur, Website Development, Software Development in Raipur, Mobile Application in Raipur, Graphic Designing in Raipur ");
		m.addAttribute("metatags","Website Company in Raipur,Website Design in Raipur , Website Designing Company in Raipur, Website Designing Company in Chhattisgarh ,Web designing company in raipur, ");
		return "services";
	}
	@RequestMapping(value="services/Website-Designing-company-Choubey-Colony-Raipur",method=RequestMethod.GET)
	public String choubeycolony(Model m) {
 		m.addAttribute("title","Website Designing Company in Choubey Colony Raipur | Website Development in Choubey Colony | Graphic Designing in Choubey Colony ");
        m.addAttribute("area","Choubey Colony");
 		m.addAttribute("metadesc","Best Website Designing Company in Choubey Colony, Which focuses on developing a website which is best in design and also SEO friendly Choubey Colony, Designer in Choubey Colony ");
		m.addAttribute("metatags","Designer in Choubey Colony, Web Design in Choubey Colony, Website Development in Choubey Colony, Website Design in Choubey Colony, Best Website Design and Development in Choubey Colony");
		return "webdesign";
	}
	@RequestMapping(value="services/Website-Designing-Company-Samta-Colony-Raipur",method=RequestMethod.GET)
	public String samtacolony(Model m) {
 		m.addAttribute("title","Website Designing Company in Samta Colony Raipur | Website Development in Samta Colony | Graphic Designing in Samta Colony ");
 		m.addAttribute("area","Samta Colony");
 		m.addAttribute("metadesc","Best Website Designing Company in Samta Colony, Which focuses on developing a website which is best in design and also SEO friendly Samta Colony, Designer in Samta Colony ");
		m.addAttribute("metatags","Designer in Samta Colony, Web Design in Samta Colony, Website Development in Samta Colony, Website Design in Samta Colony, Best Website Design and Development in Samta Colony");
		return "webdesign";
	}
	@RequestMapping(value="services/Website-Designing-Company-Jaistambh-Chowk-Raipur",method=RequestMethod.GET)
	public String jaistambhchowk(Model m) {
 		m.addAttribute("title","Website Designing Company in Jaistambh Chowk Raipur| Website Development in Jaistambh Chowk | Graphic Designing in Jaistambh Chowk ");
 		m.addAttribute("area","Jaistambh Chowk");
 		m.addAttribute("metadesc","Best Website Designing Company in Jaistambh Chowk, Which focuses on developing a website which is best in design and also SEO friendly Jaistambh Chowk, Designer in Jaistambh Chowk ");
		m.addAttribute("metatags","Designer in Samta Colony, Web Design in Jaistambh Chowk, Website Development in Jaistambh Chowk, Website Design in Jaistambh Chowk, Best Website Design and Development in Jaistambh Chowk");
		return "webdesign";
	}
	@RequestMapping(value="services/Website-Designing-Company-Pandri-Raipur",method=RequestMethod.GET)
	public String pandri(Model m) {
 		m.addAttribute("title","Website Designing Company in Pandri Raipur| Website Development in Pandri | Graphic Designing in Pandri ");
 		m.addAttribute("area","Pandri");
 		m.addAttribute("metadesc","Best Website Designing Company in Pandri, Which focuses on developing a website which is best in design and also SEO friendly Pandri, Designer in Pandri ");
		m.addAttribute("metatags","Designer in Pandri, Web Design in Pandri, Website Development in Pandri, Website Design in Pandri, Best Website Design and Development in Pandri");
		return "webdesign";
	}
	@RequestMapping(value="services/Website-Designing-Company-Devendra-Nagar-Raipur",method=RequestMethod.GET)
	public String DevendraNagar(Model m) {
 		m.addAttribute("title","Website Designing Company in Devendra Nagar Raipur | Website Development in Devendra-Nagar | Graphic Designing in Devendra-Nagar ");
 		m.addAttribute("area","Devendra-Nagar");
 		m.addAttribute("metadesc","Best Website Designing Company in Devendra-Nagar, Which focuses on developing a website which is best in design and also SEO friendly Devendra-Nagar, Designer in Devendra-Nagar ");
		m.addAttribute("metatags","Designer in Devendra-Nagar, Web Design in Devendra-Nagar, Website Development in Devendra-Nagar, Website Design in Devendra-Nagar, Best Website Design and Development in Devendra-Nagar");
		return "webdesign";
	}
	@RequestMapping(value="services/Website-Designing-Company-Station-Road-Raipur",method=RequestMethod.GET)
	public String StationRoad(Model m) {
 		m.addAttribute("title","Website Designing Company in Station Road Raipur | Website Development in Devendra-Nagar | Graphic Designing in Devendra-Nagar ");
 		m.addAttribute("area","Devendra-Nagar");
 		m.addAttribute("metadesc","Best Website Designing Company in Devendra-Nagar, Which focuses on developing a website which is best in design and also SEO friendly Devendra-Nagar, Designer in Devendra-Nagar ");
		m.addAttribute("metatags","Designer in Devendra-Nagar, Web Design in Devendra-Nagar, Website Development in Devendra-Nagar, Website Design in Devendra-Nagar, Best Website Design and Development in Devendra-Nagar");
		return "webdesign";
	}
	@RequestMapping(value="services/Website-Designing-Company-Malviya-Road-Raipur",method=RequestMethod.GET)
	public String MalviyaRoad(Model m) {
 		m.addAttribute("title","Website Designing Company in Malviya Road Raipur | Website Development in Malviya Road | Graphic Designing in Malviya Road ");
 		m.addAttribute("area","Malviya Road");
 		m.addAttribute("metadesc","Best Website Designing Company in Malviya Road, Which focuses on developing a website which is best in design and also SEO friendly Malviya Road, Designer in Malviya Road ");
		m.addAttribute("metatags","Designer in Malviya Road, Web Design in Malviya Road, Website Development in Malviya Road, Website Design in Malviya Road, Best Website Design and Development in Malviya Road");
		return "webdesign";
	}
	@RequestMapping(value="services/Website-Designing-Company-Vidhan-Sabha-Road-Raipur",method=RequestMethod.GET)
	public String VidhanSabhaRoad(Model m) {
 		m.addAttribute("title","Website Designing Company in Vidhan Sabha Road Raipur | Website Development in Vidhan Sabha Road | Graphic Designing in Vidhan Sabha Road ");
 		m.addAttribute("area","Vidhan Sabha Road");
 		m.addAttribute("metadesc","Best Website Designing Company in Vidhan Sabha Road, Which focuses on developing a website which is best in design and also SEO friendly Vidhan Sabha Road, Designer in Vidhan Sabha Road ");
		m.addAttribute("metatags","Designer in Vidhan Sabha Road, Web Design in Vidhan Sabha Road, Website Development in Vidhan Sabha Road, Website Design in Vidhan Sabha Road, Best Website Design and Development in Vidhan Sabha Road");
		return "webdesign";
	}
	@RequestMapping(value="services/Website-Designing-Company-GE-Road-Raipur",method=RequestMethod.GET)
	public String GERoad(Model m) {
 		m.addAttribute("title","Website Designing Company in GE Road Raipur | Website Development in GE Road Raipur | Graphic Designing in GE Road ");
 		m.addAttribute("area","GE Road");
 		m.addAttribute("metadesc","Best Website Designing Company in GE Road, Which focuses on developing a website which is best in design and also SEO friendly GE Road, Designer in GE Road");
		m.addAttribute("metatags","Designer in GE Road, Web Design in GE Road, Website Development in GE Road, Website Design in GE Road, Best Website Design and Development in GE Road");
		return "webdesign";
	}
	@RequestMapping(value="services/Website-Designing-Company-Kota-Raipur",method=RequestMethod.GET)
	public String kota(Model m) {
 		m.addAttribute("title","Website Designing Company in Kota Raipur | Website Development in Kota Raipur | Graphic Designing in Kota ");
 		m.addAttribute("area","Kota");
 		m.addAttribute("metadesc","Best Website Designing Company in Kota, Which focuses on developing a website which is best in design and also SEO friendly Kota, Designer in Kota");
		m.addAttribute("metatags","Designer in Kota, Web Design in Kota, Website Development in Kota, Website Design in Kota, Best Website Design and Development in Kota");
		return "webdesign";
	}
	@RequestMapping(value="services/Website-Designing-Company-Kabir-Nagar-Raipur",method=RequestMethod.GET)
	public String kabeernagar(Model m) {
 		m.addAttribute("title","Website Designing Company in Kabir Nagar Raipur | Website Development in Kabir Nagar Raipur | Graphic Designing in Kabir Nagar");
 		m.addAttribute("area","Kabir Nagar");
 		m.addAttribute("metadesc","Best Website Designing Company in Kabir Nagar, Which focuses on developing a website which is best in design and also SEO friendly Kota, Designer in Kota");
		m.addAttribute("metatags","Designer in Kabir Nagar, Web Design in Kabir Nagar, Website Development in Kabir Nagar, Website Design in Kabir Nagar, Best Website Design and Development in Kabir Nagar");
		return "webdesign";
	}
	@RequestMapping(value="services/Website-Designing-Company-Jawahar-Nagar-Raipur",method=RequestMethod.GET)
	public String JawaharNagar(Model m) {
 		m.addAttribute("title","Website Designing Company in Jawahar Nagar Raipur | Website Development in Jawahar Nagar Raipur | Graphic Designing in Jawahar Nagar");
 		m.addAttribute("area","Jawahar Nagar");
 		m.addAttribute("metadesc","Best Website Designing Company in Jawahar Nagar, Which focuses on developing a website which is best in design and also SEO friendly Jawahar Nagar, Designer in Jawahar Nagar");
		m.addAttribute("metatags","Designer in Jawahar Nagar, Web Design in Jawahar Nagar, Website Development in Jawahar Nagar, Website Design in Jawahar Nagar, Best Website Design and Development in Jawahar Nagar");
		return "webdesign";
	}
	@RequestMapping(value="services/Website-Designing-Company-Tatibandh-Raipur",method=RequestMethod.GET)
	public String Tatibandh(Model m) {
 		m.addAttribute("title","Website Designing Company in Tatibandh Raipur | Website Development in Tatibandh Raipur | Graphic Designing in Tatibandh");
 		m.addAttribute("area","Tatibandh");
 		m.addAttribute("metadesc","Best Website Designing Company in Tatibandh, Which focuses on developing a website which is best in design and also SEO friendly Tatibandh, Designer in Tatibandh");
		m.addAttribute("metatags","Designer in Tatibandh, Web Design in Tatibandh, Website Development in Tatibandh, Website Design in Tatibandh, Best Website Design and Development in Tatibandh");
		return "webdesign";
	}
	@RequestMapping(value="services/Website-Designing-Company-Tikrapara-Raipur",method=RequestMethod.GET)
	public String Tikrapara(Model m) {
 		m.addAttribute("title","Website Designing Company in Tikrapara Raipur | Website Development in Tikrapara Raipur | Graphic Designing in Tikrapara");
 		m.addAttribute("area","Tikrapara");
 		m.addAttribute("metadesc","Best Website Designing Company in Tikrapara, Which focuses on developing a website which is best in design and also SEO friendly Tikrapara, Designer in Tikrapara");
		m.addAttribute("metatags","Designer in Tikrapara, Web Design in Tikrapara, Website Development in Tikrapara, Website Design in Tikrapara, Best Website Design and Development in Tikrapara");
		return "webdesign";
	}
	@RequestMapping(value="services/Website-Designing-Company-Sundar-Nagar-Raipur",method=RequestMethod.GET)
	public String SunderNagar(Model m) {
 		m.addAttribute("title","Website Designing Company in Sundar Nagar Raipur | Website Development in Sundar Nagar Raipur | Graphic Designing in Sundar Nagar");
 		m.addAttribute("area","Sundar Nagar");
 		m.addAttribute("metadesc","Best Website Designing Company in Sundar Nagar, Which focuses on developing a website which is best in design and also SEO friendly Sundar Nagar, Designer in Sundar Nagar");
		m.addAttribute("metatags","Designer in Sundar Nagar, Web Design in Sundar Nagar, Website Development in Sundar Nagar, Website Design in Sundar Nagar, Best Website Design and Development in Sundar Nagar");
		return "webdesign";
	}
	@RequestMapping(value="services/Website-Designing-Company-DDU-Nagar-Raipur",method=RequestMethod.GET)
	public String ddunagar(Model m) {
 		m.addAttribute("title","Website Designing Company in DDU Nagar Raipur | Website Development in DDU Nagar Raipur | Graphic Designing in DDU Nagar");
 		m.addAttribute("area","DDU Nagar");
 		m.addAttribute("metadesc","Best Website Designing Company in DDU Nagar, Which focuses on developing a website which is best in design and also SEO friendly DDU Nagar, Designer in DDU Nagar");
		m.addAttribute("metatags","Designer in DDU Nagar, Web Design in DDU Nagar, Website Development in DDU Nagar, Website Design in DDU Nagar, Best Website Design and Development in DDU Nagar");
		return "webdesign";
	}
	@RequestMapping(value="services/Website-Designing-Company-Amanaka-Raipur",method=RequestMethod.GET)
	public String Amanaka(Model m) {
 		m.addAttribute("title","Website Designing Company in Amanaka Raipur | Website Development in Amanaka Raipur | Graphic Designing in Amanaka");
 		m.addAttribute("area","Amanaka");
 		m.addAttribute("metadesc","Best Website Designing Company in Amanaka, Which focuses on developing a website which is best in design and also SEO friendly Amanaka, Designer in Amanaka");
		m.addAttribute("metatags","Designer in Amanaka, Web Design in Amanaka, Website Development in Amanaka, Website Design in Amanaka, Best Website Design and Development in Amanaka");
		return "webdesign";
	}
	@RequestMapping(value="services/Website-Designing-Company-Byron-Bazar-Raipur",method=RequestMethod.GET)
	public String Byronbazar(Model m) {
 		m.addAttribute("title","Website Designing Company in Byron-Bazar Raipur | Website Development in Byron-Bazar Raipur | Graphic Designing in Byron-Bazar");
 		m.addAttribute("area","Byron-Bazar");
 		m.addAttribute("metadesc","Best Website Designing Company in Byron Bazar, Which focuses on developing a website which is best in design and also SEO friendly Byron-Bazar, Designer in Byron Bazar");
		m.addAttribute("metatags","Designer in Byron Bazar, Web Design in Byron Bazar, Website Development in Byron-Bazar, Website Design in Byron-Bazar, Best Website Design and Development in Byron Bazar");
		return "webdesign";
	}
	@RequestMapping(value="services/Website-Designing-Company-Katora-Talab-Raipur",method=RequestMethod.GET)
	public String katoratalab(Model m) {
 		m.addAttribute("title","Website Designing Company in Katora Talab Raipur | Website Development in Katora Talab Raipur | Graphic Designing in Katora Talab");
 		m.addAttribute("area","Katora Talab");
 		m.addAttribute("metadesc","Best Website Designing Company in Katora Talab, Which focuses on developing a website which is best in design and also SEO friendly Katora Talab, Designer in Katora Talab");
		m.addAttribute("metatags","Designer in Katora Talab, Web Design in Katora Talab, Website Development in Katora Talab, Website Design in Katora Talab, Best Website Design and Development in Katora Talab");
		return "webdesign";
	}
	@RequestMapping(value="services/Website-Designing-Company-Tagore-Nagar-Raipur",method=RequestMethod.GET)
	public String tagorenagar(Model m) {
 		m.addAttribute("title","Website Designing Company in Tagore Nagar Raipur | Website Development in Tagore Nagar Raipur | Graphic Designing in Tagore Nagar");
 		m.addAttribute("area","Tagore Nagar");
 		m.addAttribute("metadesc","Best Website Designing Company in Tagore Nagar, Which focuses on developing a website which is best in design and also SEO friendly Tagore Nagar, Designer in Tagore Nagar");
		m.addAttribute("metatags","Designer in Tagore Nagar, Web Design in Tagore Nagar, Website Development in Tagore Nagar, Website Design in Tagore Nagar, Best Website Design and Development in Tagore Nagar");
		return "webdesign";
	}
	@RequestMapping(value="services/Website-Designing-Company-Anupam-Nagar-Raipur",method=RequestMethod.GET)
	public String anupamnagar(Model m) {
 		m.addAttribute("title","Website Designing Company in Anupam Nagar Raipur | Website Development in Anupam Nagar Raipur | Graphic Designing in Anupam Nagar");
 		m.addAttribute("area","Anupam Nagar");
 		m.addAttribute("metadesc","Best Website Designing Company in Anupam Nagar, Which focuses on developing a website which is best in design and also SEO friendly Anupam Nagar, Designer in Anupam Nagar");
		m.addAttribute("metatags","Designer in Anupam Nagar, Web Design in Anupam Nagar, Website Development in Anupam Nagar, Website Design in Anupam Nagar, Best Website Design and Development in Anupam Nagar");
		return "webdesign";
	}
	@RequestMapping(value="services/Website-Designing-Company-Shailendra-Nagar-Raipur",method=RequestMethod.GET)
	public String Shailendranagar(Model m) {
 		m.addAttribute("title","Website Designing Company in Shailendra Nagar Raipur | Website Development in Shailendra Nagar Raipur | Graphic Designing in Shailendra Nagar");
 		m.addAttribute("area","Shailendra Nagar");
 		m.addAttribute("metadesc","Best Website Designing Company in Shailendra Nagar, Which focuses on developing a website which is best in design and also SEO friendly Shailendra Nagar, Designer in Shailendra Nagar");
		m.addAttribute("metatags","Designer in Shailendra Nagar, Web Design in Shailendra Nagar, Website Development in Shailendra Nagar, Website Design in Shailendra Nagar, Best Website Design and Development in Shailendra Nagar");
		return "webdesign";
	}
	@RequestMapping(value="services/Website-Designing-Company-Bhilai",method=RequestMethod.GET)
	public String Bhilai(Model m) {
 		m.addAttribute("title"," Website Designing Company | Bhilai | KSITSOLUTION ");
 		m.addAttribute("area","Bhilai");
 		m.addAttribute("metadesc"," Are you looking for the Best Web designer and developer in Bhilai? So you are in the right place We can help you developing a website which is responsive and also fully Optimised , Designer in Bhilai");
		m.addAttribute("metatags"," Web Design in Bhilai, Website Development in Bhilai, Website Design in Bhilai, Best Website Design and Development in Bhilai");
		return "webdesign";
	}
	@RequestMapping(value="services/Website-Designing-Company-AtalNagar",method=RequestMethod.GET)
	public String AtalNagar(Model m) {
		m.addAttribute("title"," Website Designing Company | AtalNagar | KSITSOLUTION ");
 		m.addAttribute("area","AtalNagar");
 		m.addAttribute("metadesc"," Are you looking for the Best Web designer and developer in AtalNagar? So you are in the right place We can help you developing a website which is responsive and also fully Optimised , Designer in AtalNagar");
		m.addAttribute("metatags"," Web Design in AtalNagar, Website Development in AtalNagar, Website Design in AtalNagar, Best Website Design and Development in AtalNagar");
		return "webdesign";
	}
	@RequestMapping(value="services/Website-Designing-Company-Bilaspur",method=RequestMethod.GET)
	public String Bilaspur(Model m) {
		m.addAttribute("title"," Website Designing Company | Bilaspur | KSITSOLUTION ");
 		m.addAttribute("area","Bilaspur");
 		m.addAttribute("metadesc"," Are you looking for the Best Web designer and developer in Bilaspur? So you are in the right place We can help you developing a website which is responsive and also fully Optimised , Designer in Bilaspur");
		m.addAttribute("metatags"," Web Design in Bilaspur, Website Development in Bilaspur, Website Design in Bilaspur, Best Website Design and Development in Bilaspur");
        return "webdesign";
	}
	@RequestMapping(value="services/Website-Designing-Company-Rajnandgaon",method=RequestMethod.GET)
	public String Rajnandgaon(Model m) {
		m.addAttribute("title"," Website Designing Company | Rajnandgaon | KSITSOLUTION ");
 		m.addAttribute("area","Rajnandgaon");
 		m.addAttribute("metadesc"," Are you looking for the Best Web designer and developer in Rajnandgaon? So you are in the right place We can help you developing a website which is responsive and also fully Optimised , Designer in Rajnandgaon");
		m.addAttribute("metatags"," Web Design in Rajnandgaon, Website Development in Rajnandgaon, Website Design in Rajnandgaon, Best Website Design and Development in Rajnandgaon");
		return "webdesign";
	}
	@RequestMapping(value="services/Website-Designing-Company-Durg",method=RequestMethod.GET)
	public String Durg(Model m) {
		m.addAttribute("title"," Website Designing Company | Durg | KSITSOLUTION ");
 		m.addAttribute("area","Durg");
 		m.addAttribute("metadesc"," Are you looking for the Best Web designer and developer in Durg? So you are in the right place We can help you developing a website which is responsive and also fully Optimised , Designer in Durg");
		m.addAttribute("metatags"," Web Design in Durg, Website Development in Durg, Website Design in Durg, Best Website Design and Development in Durg");
		return "webdesign";
	}
	@RequestMapping(value="services/Website-Designing-Company-korba",method=RequestMethod.GET)
	public String Korba(Model m) {
		m.addAttribute("title"," Website Designing Company | Korba | KSITSOLUTION ");
 		m.addAttribute("area","Korba");
 		m.addAttribute("metadesc"," Are you looking for the Best Web designer and developer in Korba? So you are in the right place We can help you developing a website which is responsive and also fully Optimised , Designer in Korba");
		m.addAttribute("metatags","Designer in Korba, Web Design in Korba, Website Development in Korba, Website Design in Korba, Best Website Design and Development in Korba");
		return "webdesign";
	}
	@RequestMapping(value="services/Website-Designing-Company-Raigarh",method=RequestMethod.GET)
	public String Raigarh(Model m) {
		m.addAttribute("title"," Website Designing Company | Raigarh | KSITSOLUTION ");
 		m.addAttribute("area","Raigarh");
 		m.addAttribute("metadesc"," Are you looking for the Best Web designer and developer in Raigarh? So you are in the right place We can help you developing a website which is responsive and also fully Optimised , Designer in Raigarh");
		m.addAttribute("metatags"," Web Design in Raigarh, Website Development in Raigarh, Website Design in Raigarh, Best Website Design and Development in Raigarh");
		return "webdesign";
	}
	@RequestMapping(value="services/Website-Designing-Company-Jagdalpur",method=RequestMethod.GET)
	public String Jagdalpur(Model m) {
		m.addAttribute("title"," Website Designing Company | Jagdalpur | KSITSOLUTION ");
 		m.addAttribute("area","Jagdalpur");
 		m.addAttribute("metadesc"," Are you looking for the Best Web designer and developer in Jagdalpur? So you are in the right place We can help you developing a website which is responsive and also fully Optimised , Designer in Jagdalpur");
		m.addAttribute("metatags"," Web Design in Jagdalpur, Website Development in Jagdalpur, Website Design in Jagdalpur, Best Website Design and Development in Jagdalpur");
		return "webdesign";
	}
	@RequestMapping(value="services/Website-Designing-Company-Ambikapur",method=RequestMethod.GET)
	public String Ambikapur(Model m) {
		m.addAttribute("title"," Website Designing Company | Ambikapur | KSITSOLUTION ");
 		m.addAttribute("area","Ambikapur");
 		m.addAttribute("metadesc"," Are you looking for the Best Web designer and developer in Ambikapur? So you are in the right place We can help you developing a website which is responsive and also fully Optimised , Designer in Ambikapur");
		m.addAttribute("metatags"," Web Design in Ambikapur, Website Development in Ambikapur, Website Design in Ambikapur, Best Website Design and Development in Ambikapur");
		return "webdesign";
	}
	@RequestMapping(value="services/Website-Designing-Company-Chirmiri",method=RequestMethod.GET)
	public String Chirmiri(Model m) {
		m.addAttribute("title"," Website Designing Company | Chirmiri | KSITSOLUTION ");
 		m.addAttribute("area","Chirmiri");
 		m.addAttribute("metadesc"," Are you looking for the Best Web designer and developer in Chirmiri? So you are in the right place We can help you developing a website which is responsive and also fully Optimised , Designer in Chirmiri");
		m.addAttribute("metatags"," Web Design in Chirmiri, Website Development in Chirmiri, Website Design in Chirmiri, Best Website Design and Development in Chirmiri");
		return "webdesign";
	}
	@RequestMapping(value="services/Website-Designing-Company-Mahasamund",method=RequestMethod.GET)
	public String Mahasamund(Model m) {
		m.addAttribute("title"," Website Designing Company | Mahasamund | KSITSOLUTION ");
 		m.addAttribute("area","Mahasamund");
 		m.addAttribute("metadesc"," Are you looking for the Best Web designer and developer in Mahasamund? So you are in the right place We can help you developing a website which is responsive and also fully Optimised , Designer in Mahasamund");
		m.addAttribute("metatags","Designer in Mahasamund, Web Design in Mahasamund, Website Development in Mahasamund, Website Design in Mahasamund, Best Website Design and Development in Mahasamund");
		return "webdesign";
	}
	@RequestMapping(value="services/Website-Designing-Company-Dhamtari",method=RequestMethod.GET)
	public String Dhamtari(Model m) {
		m.addAttribute("title"," Website Designing Company | Dhamtari | KSITSOLUTION ");
 		m.addAttribute("area","Dhamtari");
 		m.addAttribute("metadesc"," Are you looking for the Best Web designer and developer in Dhamtari? So you are in the right place We can help you developing a website which is responsive and also fully Optimised , Designer in Dhamtari");
		m.addAttribute("metatags"," Web Design in Dhamtari, Website Development in Dhamtari, Website Design in Dhamtari, Best Website Design and Development in Dhamtari");
		return "webdesign";
	}
	@RequestMapping(value="services/Website-Designing-Company-Mumbai",method=RequestMethod.GET)
	public String mumbai(Model m) {
		m.addAttribute("title"," Website Designing Company | Mumbai | KSITSOLUTION ");
 		m.addAttribute("area","Mumbai");
 		m.addAttribute("metadesc"," Are you looking for the Best Web designer and developer in Mumbai? So you are in the right place We can help you developing a website which is responsive and also fully Optimised , Designer in Mumbai");
		m.addAttribute("metatags"," Web Design in Mumbai, Website Development in Mumbai, Website Design in Mumbai, Best Website Design and Development in Mumbai");
		return "webdesign";
	}
	@RequestMapping(value="services/Website-Designing-Company-Nagpur",method=RequestMethod.GET)
	public String Nagpur(Model m) {
 		m.addAttribute("title","Website Designing Company in Nagpur | Web Designer in Nagpur ");
 		m.addAttribute("area","Nagpur");
 		m.addAttribute("metadesc","Best Website Designing Company in Nagpur, Which focuses on developing a website which is best in design and also SEO friendly Nagpur, Designer in Nagpur");
		m.addAttribute("metatags","Designer in Nagpur, Web Design in Nagpur, Website Development in Nagpur, Website Design in Nagpur, Best Website Design and Development in Nagpur");
		return "webdesign";
	}
	@RequestMapping(value="services/Website-Designing-Company-Pune",method=RequestMethod.GET)
	public String Pune(Model m) {
 		m.addAttribute("title","Website Designing Company in Pune | Web Designer in Pune ");
 		m.addAttribute("area","Pune");
 		m.addAttribute("metadesc","Best Website Designing Company in Pune, Which focuses on developing a website which is best in design and also SEO friendly Mumbai, Designer in Pune");
		m.addAttribute("metatags","Designer in Pune, Web Design in Pune, Website Development in Pune, Website Design in Pune, Best Website Design and Development in Pune");
		return "webdesign";
	}	
}