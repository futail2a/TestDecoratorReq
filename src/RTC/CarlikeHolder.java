package RTC;

/**
* RTC/CarlikeHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class CarlikeHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Carlike value = null;

  public CarlikeHolder ()
  {
  }

  public CarlikeHolder (RTC.Carlike initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.CarlikeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.CarlikeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.CarlikeHelper.type ();
  }

}
