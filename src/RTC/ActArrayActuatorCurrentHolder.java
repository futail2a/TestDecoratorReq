package RTC;

/**
* RTC/ActArrayActuatorCurrentHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��10�� 14��37��13�b JST
*/

public final class ActArrayActuatorCurrentHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.ActArrayActuatorCurrent value = null;

  public ActArrayActuatorCurrentHolder ()
  {
  }

  public ActArrayActuatorCurrentHolder (RTC.ActArrayActuatorCurrent initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.ActArrayActuatorCurrentHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.ActArrayActuatorCurrentHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.ActArrayActuatorCurrentHelper.type ();
  }

}
