package RTC;


/**
* RTC/OAP.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class OAP implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Vector3D orientation = null;
  public RTC.Vector3D approach = null;
  public RTC.Vector3D position = null;

  public OAP ()
  {
  } // ctor

  public OAP (RTC.Vector3D _orientation, RTC.Vector3D _approach, RTC.Vector3D _position)
  {
    orientation = _orientation;
    approach = _approach;
    position = _position;
  } // ctor

} // class OAP
