package RTC;


/**
* RTC/TimedCarlike.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class TimedCarlike implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.Carlike data = null;

  public TimedCarlike ()
  {
  } // ctor

  public TimedCarlike (RTC.Time _tm, RTC.Carlike _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedCarlike
