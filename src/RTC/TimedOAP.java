package RTC;


/**
* RTC/TimedOAP.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class TimedOAP implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.OAP data = null;

  public TimedOAP ()
  {
  } // ctor

  public TimedOAP (RTC.Time _tm, RTC.OAP _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedOAP
