package RTC;


/**
* RTC/Hypothesis3DListHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��38�b JST
*/


/*!
     * @typedef Hypothesis3DList
     */
public final class Hypothesis3DListHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Hypothesis3D value[] = null;

  public Hypothesis3DListHolder ()
  {
  }

  public Hypothesis3DListHolder (RTC.Hypothesis3D[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.Hypothesis3DListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.Hypothesis3DListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.Hypothesis3DListHelper.type ();
  }

}
