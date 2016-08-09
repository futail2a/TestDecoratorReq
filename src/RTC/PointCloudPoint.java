package RTC;


/**
* RTC/PointCloudPoint.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��38�b JST
*/

public final class PointCloudPoint implements org.omg.CORBA.portable.IDLEntity
{

  /// The position of the point.
  public RTC.Point3D point = null;

  /// The colour of the point, if any.
  public RTC.RGBColour colour = null;

  public PointCloudPoint ()
  {
  } // ctor

  public PointCloudPoint (RTC.Point3D _point, RTC.RGBColour _colour)
  {
    point = _point;
    colour = _colour;
  } // ctor

} // class PointCloudPoint
