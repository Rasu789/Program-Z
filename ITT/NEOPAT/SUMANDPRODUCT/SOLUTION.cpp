#include<iostream>
using namespace std;
int main()
{
    int n ;
    cin>>n;
    int a[n];
    int sum=0;
    int pro=1;
    if(n>0)
    {
    
      for(int i=0;i<n;i++)
      {
        cin>>a[i];
      }
      for(int i=0;i<n;i++)
      {
       
        sum+=a[i];
        pro*=a[i];
       
      }
      cout<<"Sum:"<<sum<<endl;
      cout<<"Product:"<<pro<<endl;
      
    }
  else
    {
        for(int i=n;i<=0;i++)
        {
            cin>>a[i];
        }
        cout<<"Invalid";
    }
    return 0;
   
}
