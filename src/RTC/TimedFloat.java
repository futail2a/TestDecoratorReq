package RTC;


/**
* RTC/TimedFloat.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/BasicDataType.idl����
* 2016�N8��10�� 14��37��11�b JST
*/

public final class TimedFloat implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public float data = (float)0;

  public TimedFloat ()
  {
  } // ctor

  public TimedFloat (RTC.Time _tm, float _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedFloat
