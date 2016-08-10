package RTC;


/**
* RTC/MulticameraGeometry.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��10�� 14��37��13�b JST
*/

public final class MulticameraGeometry implements org.omg.CORBA.portable.IDLEntity
{

  /// Overall geometry of the camera system.
  public RTC.Geometry3D geometry = null;

  /// Geometry of each camera.
  public RTC.Geometry3D cameraGeometries[] = null;

  public MulticameraGeometry ()
  {
  } // ctor

  public MulticameraGeometry (RTC.Geometry3D _geometry, RTC.Geometry3D[] _cameraGeometries)
  {
    geometry = _geometry;
    cameraGeometries = _cameraGeometries;
  } // ctor

} // class MulticameraGeometry
