package RTC;


/**
* RTC/Time.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/BasicDataType.idl����
* 2016�N8��10�� 14��37��11�b JST
*/

public final class Time implements org.omg.CORBA.portable.IDLEntity
{
  public int sec = (int)0;

  // sec
  public int nsec = (int)0;

  public Time ()
  {
  } // ctor

  public Time (int _sec, int _nsec)
  {
    sec = _sec;
    nsec = _nsec;
  } // ctor

} // class Time
