package GIS;

import java.util.Date;

public class GisObject {
	private String Mac, SSID, Authmode, Channel, rssi,AccuracyMeters, Type;
	private int CurrentLatitude, CurrentLongitude,AltitudeMeters;
	private Date firstSeen;

	public GisObject(String _Mac, String _SSID, String _Authmode, String _firstSeen, String _Channel, String _rssi,
			String _CurrentLatitude, String _CurrentLongitude, String _AltitudeMeters, String _AccuracyMeters,
			String _Type) {
		Mac=_Mac;
		SSID=_SSID;
		Authmode=_Authmode;
		firstSeen=_firstSeen;
		Channel=_Channel;
		rssi=_rssi;
		CurrentLatitude=_CurrentLatitude;
		CurrentLongitude=_CurrentLongitude;
		AltitudeMeters=_AltitudeMeters;
		AccuracyMeters=_AccuracyMeters;
		Type=_Type;
	}
	public GisObject(String[]s) {
		Mac=s[0];
		SSID=s[1];
		Authmode=s[2];
		firstSeen=s[3];
		Channel=s[4];
		rssi=s[5];
		CurrentLatitude=s[6];
		CurrentLongitude=s[7];
		AltitudeMeters=s[8];
		AccuracyMeters=s[9];
		Type=s[10];

	}
	
	/*********************Getters**************************/
	public String getMac() {
		return Mac;
	}
	public String getSSID() {
		return SSID;
	}
	public String getAuthmode() {
		return Authmode;
	}
	public String getfirstSeen() {
		return firstSeen;
	}
	public String getChannel() {
		return Channel;
	}
	public String getRssi() {
		return rssi;
	}
	public String getCurrentLatitude() {
		return CurrentLatitude;
	}
	public String getCurrentLongitude() {
		return CurrentLongitude;
	}
	public String getAltitudeMeters() {
		return AltitudeMeters;
	}
	public String getAccuracyMeters() {
		return AccuracyMeters;
	}
	public String getType() {
		return Type;
	}
	
	/*******************************Setters*****************************/
	public void setMac(String _Mac) {
		Mac=_Mac;
	}
	public void setSSID(String _SSID) {
		SSID=_SSID;
	}
	public void setAuthmode(String _Authmode) {
		Authmode=_Authmode;
	}
	public void setfirstSeen(String _firstSeen) {
		firstSeen=_firstSeen;
	}
	public void setChannel(String _Channel) {
		Channel=_Channel;
	}
	public void setRssi(String _rssi) {
		rssi=_rssi;
	}
	public void setCurrentLatitude(String _CurrentLatitude) {
		CurrentLatitude=_CurrentLatitude;
	}
	public void setCurrentLongitude(String _CurrentLongitude) {
		CurrentLongitude=_CurrentLongitude;
	}
	public void setAltitudeMeters(String _AltitudeMeters) {
		AltitudeMeters=_AltitudeMeters;
	}
	public void setAccuracyMeters(String _AccuracyMeters) {
		AccuracyMeters=_AccuracyMeters;
	}
	public void setType(String _Type) {
		Type=_Type;
	}
}
