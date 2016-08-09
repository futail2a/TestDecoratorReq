package RTC;


/**
* RTC/TimedDouble.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/BasicDataType.idl����
* 2016�N8��9�� 13��07��36�b JST
*/

public final class TimedDouble implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public double data = (double)0;

  public TimedDouble ()
  {
  } // ctor

  public TimedDouble (RTC.Time _tm, double _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedDouble
