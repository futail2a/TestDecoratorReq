package RTC;

/**
* RTC/SpeedHeading3DHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class SpeedHeading3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.SpeedHeading3D value = null;

  public SpeedHeading3DHolder ()
  {
  }

  public SpeedHeading3DHolder (RTC.SpeedHeading3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.SpeedHeading3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.SpeedHeading3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.SpeedHeading3DHelper.type ();
  }

}
