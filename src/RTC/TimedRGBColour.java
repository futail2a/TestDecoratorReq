package RTC;


/**
* RTC/TimedRGBColour.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class TimedRGBColour implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.RGBColour data = null;

  public TimedRGBColour ()
  {
  } // ctor

  public TimedRGBColour (RTC.Time _tm, RTC.RGBColour _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedRGBColour
