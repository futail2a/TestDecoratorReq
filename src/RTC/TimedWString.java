package RTC;


/**
* RTC/TimedWString.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/BasicDataType.idl����
* 2016�N8��10�� 14��37��11�b JST
*/

public final class TimedWString implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public String data = null;

  public TimedWString ()
  {
  } // ctor

  public TimedWString (RTC.Time _tm, String _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedWString
