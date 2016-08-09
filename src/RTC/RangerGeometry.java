package RTC;


/**
* RTC/RangerGeometry.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��38�b JST
*/

public final class RangerGeometry implements org.omg.CORBA.portable.IDLEntity
{

  /// Overall geometry of the ranger device, such as the centroid of an array of sonar sensors.
  public RTC.Geometry3D geometry = null;

  /// measured from each of these.
  public RTC.Geometry3D elementGeometries[] = null;

  public RangerGeometry ()
  {
  } // ctor

  public RangerGeometry (RTC.Geometry3D _geometry, RTC.Geometry3D[] _elementGeometries)
  {
    geometry = _geometry;
    elementGeometries = _elementGeometries;
  } // ctor

} // class RangerGeometry
