package RTC;

/**
* RTC/ActArrayActuatorPosHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class ActArrayActuatorPosHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.ActArrayActuatorPos value = null;

  public ActArrayActuatorPosHolder ()
  {
  }

  public ActArrayActuatorPosHolder (RTC.ActArrayActuatorPos initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.ActArrayActuatorPosHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.ActArrayActuatorPosHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.ActArrayActuatorPosHelper.type ();
  }

}
