package RTC;

/**
* RTC/PoseVel2DHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class PoseVel2DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.PoseVel2D value = null;

  public PoseVel2DHolder ()
  {
  }

  public PoseVel2DHolder (RTC.PoseVel2D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.PoseVel2DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.PoseVel2DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.PoseVel2DHelper.type ();
  }

}
