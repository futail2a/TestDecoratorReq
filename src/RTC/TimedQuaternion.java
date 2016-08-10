package RTC;


/**
* RTC/TimedQuaternion.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class TimedQuaternion implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.Quaternion data = null;

  public TimedQuaternion ()
  {
  } // ctor

  public TimedQuaternion (RTC.Time _tm, RTC.Quaternion _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedQuaternion
