package RTC;

/**
* RTC/Waypoint2DHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��10�� 14��37��13�b JST
*/

public final class Waypoint2DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Waypoint2D value = null;

  public Waypoint2DHolder ()
  {
  }

  public Waypoint2DHolder (RTC.Waypoint2D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.Waypoint2DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.Waypoint2DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.Waypoint2DHelper.type ();
  }

}
