package RTC;


/**
* RTC/OGMap.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/MobileRobot.idl����
* 2016�N8��9�� 13��07��35�b JST
*/

public final class OGMap implements org.omg.CORBA.portable.IDLEntity
{

  /// Time stamp.
  public RTC.Time tm = null;

  /// OccupancyGridMap Configuration
  public RTC.OGMapConfig config = null;

  /// OccupancyGridMap Data
  public RTC.OGMapTile map = null;

  public OGMap ()
  {
  } // ctor

  public OGMap (RTC.Time _tm, RTC.OGMapConfig _config, RTC.OGMapTile _map)
  {
    tm = _tm;
    config = _config;
    map = _map;
  } // ctor

} // class OGMap
