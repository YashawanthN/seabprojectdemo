package utilities;

import java.util.HashMap;


import base.basefile;

public class downloadFile extends basefile {
	
	
	public void downloadfiles()
	{
		HashMap<String, Object> preference = new HashMap<String, Object>();
		preference.put("profile.default_content_settings.popups", 0);
		String downloadFilepath = System.getProperty("user.dir");
		preference.put("download.default_directory", downloadFilepath);
		/* options.setExperimentalOption("pref", preference); */	 
	
	}
	
	
	

}
