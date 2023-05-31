package abstractclassandinheritance;

public class ConfigurationSettings {
	private static ConfigurationSettings instance ;
	private ConfigurationSettings() {
		
	}
	public static synchronized ConfigurationSettings getInstance() {
		if (instance  == null ) {
			instance = new ConfigurationSettings();
		}
		return instance;
	}


public  String getApikey() {
	return "API_KEY";
}
}