public class salarycal
{
double deall(double a)
{
double b=0.0d;
double aa=a;


if ( aa<5000)
{
b=(45.00/100.00)*aa;
}
else
{
b=((double)50/(double)100)*aa;
}
return b;
}
double husrnt(double c)
{
double d;
if ( c<5000)
{
d=100;
}
else 
{
d=200;
}
return d;
}
double trvall(double e)
{
double g;
if(e<5000)
{
g=300;
}
else
{
g=400;
}
return g;
}
double entall(double i)
{
double h;
if(i<5000)
{
h=600;
}
else
{
h=700;
}

return h;
}
}



