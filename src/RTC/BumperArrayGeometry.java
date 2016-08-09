package RTC;


/**
* RTC/BumperArrayGeometry.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class BumperArrayGeometry implements org.omg.CORBA.portable.IDLEntity
{

  /// Geometry of the entire array.
  public RTC.Geometry3D arrayGeometry = null;

  /// Geometry of each individual bumper.
  public RTC.BumperGeometry bumperGeometry[] = null;

  public BumperArrayGeometry ()
  {
  } // ctor

  public BumperArrayGeometry (RTC.Geometry3D _arrayGeometry, RTC.BumperGeometry[] _bumperGeometry)
  {
    arrayGeometry = _arrayGeometry;
    bumperGeometry = _bumperGeometry;
  } // ctor

} // class BumperArrayGeometry
