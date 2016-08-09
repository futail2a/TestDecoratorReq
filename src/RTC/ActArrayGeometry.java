package RTC;


/**
* RTC/ActArrayGeometry.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class ActArrayGeometry implements org.omg.CORBA.portable.IDLEntity
{

  /// Geometry of the overall array.
  public RTC.Geometry3D arrayGeometry = null;

  /// Geometry of the individual actuators.
  public RTC.ActArrayActuatorGeometry actuatorGeometry[] = null;

  public ActArrayGeometry ()
  {
  } // ctor

  public ActArrayGeometry (RTC.Geometry3D _arrayGeometry, RTC.ActArrayActuatorGeometry[] _actuatorGeometry)
  {
    arrayGeometry = _arrayGeometry;
    actuatorGeometry = _actuatorGeometry;
  } // ctor

} // class ActArrayGeometry
