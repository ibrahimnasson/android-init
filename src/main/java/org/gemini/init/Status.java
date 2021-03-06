package org.gemini.init;

public class Status {
  public static boolean wifiIsOn() {
    return wifiIsOn;
  }

  public static boolean wifiIsConnected() {
    return wifiIsConnected;
  }

  public static int signalStrength() {
    return signalStrength;
  }

  public static boolean screenIsOn() {
    return screenIsOn;
  }

  public static boolean userIsPresenting() {
    return userIsPresenting;
  }

  public static String ssid() {
    return ssid;
  }

  public static String lastSsid() {
    return lastSsid;
  }

  public static String lastActiveSsid() {
    return lastActiveSsid;
  }

  public static String carrier() {
    return carrier;
  }

  public static int preferredNetworkType() {
    return preferredNetworkType;
  }

  public static boolean mobileDataIsConnected() {
    return mobileDataIsConnected;
  }

  public static boolean powerConnected() {
    return powerConnected;
  }

  public static int powerLevel() {
    return powerLevel;
  }

  public static boolean powerLevelLow() {
    return powerLevelLow;
  }

  public static boolean usbCharging() {
    return usbCharging;
  }

  public static boolean acCharging() {
    return acCharging;
  }

  public static boolean wirelessCharging() {
    return wirelessCharging;
  }

  public static int networkClass() {
    return networkClass;
  }

  public static int dataNetworkClass() {
    return dataNetworkClass;
  }

  public static int voiceNetworkClass() {
    return voiceNetworkClass;
  }

  protected static boolean wifiIsOn = false;
  protected static boolean wifiIsConnected = false;
  protected static int signalStrength = 0;
  protected static boolean screenIsOn = true;
  protected static boolean userIsPresenting = true;
  protected static String ssid = "";
  protected static String lastSsid = "";
  protected static String lastActiveSsid = "";
  protected static String carrier = "";
  protected static int preferredNetworkType = 0;
  protected static boolean mobileDataIsConnected = false;
  protected static boolean powerConnected = false;
  protected static int powerLevel = 0;
  protected static boolean powerLevelLow = false;
  protected static boolean usbCharging = false;
  protected static boolean acCharging = false;
  protected static boolean wirelessCharging = false;
  protected static int networkClass = 0;
  protected static int dataNetworkClass = 0;
  protected static int voiceNetworkClass = 0;
}
