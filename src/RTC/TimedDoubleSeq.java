package RTC;


/**
* RTC/TimedDoubleSeq.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/BasicDataType.idl����
* 2016�N8��10�� 14��37��11�b JST
*/

public final class TimedDoubleSeq implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public double data[] = null;

  public TimedDoubleSeq ()
  {
  } // ctor

  public TimedDoubleSeq (RTC.Time _tm, double[] _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedDoubleSeq
