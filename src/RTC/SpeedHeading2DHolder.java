package RTC;

/**
* RTC/SpeedHeading2DHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class SpeedHeading2DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.SpeedHeading2D value = null;

  public SpeedHeading2DHolder ()
  {
  }

  public SpeedHeading2DHolder (RTC.SpeedHeading2D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.SpeedHeading2DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.SpeedHeading2DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.SpeedHeading2DHelper.type ();
  }

}
