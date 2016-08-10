package RTC;


/**
* RTC/PointCloud.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��10�� 14��37��13�b JST
*/

public final class PointCloud implements org.omg.CORBA.portable.IDLEntity
{

  /// Time stamp.
  public RTC.Time tm = null;

  /// The points in the cloud.
  public RTC.PointCloudPoint points[] = null;

  public PointCloud ()
  {
  } // ctor

  public PointCloud (RTC.Time _tm, RTC.PointCloudPoint[] _points)
  {
    tm = _tm;
    points = _points;
  } // ctor

} // class PointCloud
