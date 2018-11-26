package gis;

import geom.Point3D;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class GisObject {
	private String Mac, SSID, Authmode, Channel, rssi,AccuracyMeters, Type;
	private Point3D point;
	private Date firstSeen;
	DateFormat format = new SimpleDateFormat("dd/MM/yy hh:mm", Locale.ENGLISH);

	public GisObject(String _Mac, String _SSID, String _Authmode, String _firstSeen, String _Channel, String _rssi,
			String _CurrentLatitude, String _CurrentLongitude, String _AltitudeMeters, String _AccuracyMeters,
			String _Type) throws ParseException {
		Mac=_Mac;
		SSID=_SSID;
		Authmode=_Authmode;
		firstSeen=format.parse(_firstSeen);
		Channel=_Channel;
		rssi=_rssi;
		point=new Point3D(Double.parseDouble(_CurrentLatitude),Double.parseDouble(_CurrentLongitude),Double.parseDouble(_AltitudeMeters));
		AccuracyMeters=_AccuracyMeters;
		Type=_Type;
	}
	public GisObject(String[]s) throws ParseException {
		Mac=s[0];
		SSID=s[1];
		Authmode=s[2];
		firstSeen=format.parse(s[3]);
		Channel=s[4];
		rssi=s[5];
		point=new Point3D(Double.parseDouble(s[6]),Double.parseDouble(s[7]),Double.parseDouble(s[8]));
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
	public Date getfirstSeen() {
		return firstSeen;
	}
	public String getChannel() {
		return Channel;
	}
	public String getRssi() {
		return rssi;
	}
	public double getCurrentLatitude() {
		return point.y();
	}
	public double getCurrentLongitude() {
		return point.z();
	}
	public double getAltitudeMeters() {
		return point.x();
	}
	public String getAccuracyMeters() {
		return AccuracyMeters;
	}
	public String getType() {
		return Type;
	}
	public Point3D getPoint(){
		return point;
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
	public void setfirstSeen(Date _firstSeen) {
		firstSeen=_firstSeen;
	}
	public void setChannel(String _Channel) {
		Channel=_Channel;
	}
	public void setRssi(String _rssi) {
		rssi=_rssi;
	}
	public void setAccuracyMeters(String _AccuracyMeters) {
		AccuracyMeters=_AccuracyMeters;
	}
	public void setType(String _Type) {
		Type=_Type;
	}
}
