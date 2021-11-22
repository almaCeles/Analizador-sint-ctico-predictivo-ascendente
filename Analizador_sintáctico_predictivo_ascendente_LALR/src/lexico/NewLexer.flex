package lexico;
import static  lexico.Token.*;
%%
%class NewLexer
%type Token

white=[ \t\r\n]+
digito =[0-9]
entero ={digito}+
flotante =({entero}"."{entero})+

ID=[A-Za-z]+["_"0-9A-Za-z]*
%{
	public String lexeme;
%}
%%


{white} {/*Ignore*/}

"int"       {return iint;}
"flotante"  {return ffloat;}
"char"      {return cchar;}
"bolean"    {return bbolean;}

";" { return puntoYcoma;}
"(" { return parentisiIzq;}
")" { return parentisiDere;}
"{" { return llaveIzq;}
"}" { return lleveDere;}
"[" { return corcheteIzq;}
"]" { return corcheteDere;}
"+" { return suma;}
"-" { return resta;}
"*" { return multiplicacion;}
"/" { return divicion;}
"!" { return admiracion;} 
"&&" { return igualIgual;} 
"<" { return menorque;}
">" { return mayorque;}
"=" { return igual;}
"<="        { return menorIgual;}
">="	    { return mayorIgual;}
")"	    { return parD;}
"*"	    {return multiplicacion;}
"true"      {return ttrue;}
"false"     {return ffalse;}
"if"        {return iif;}
"else"      {return eelse;}
"while"     {return wwhile;}
"do"        {return ddo;}
"break"     {return bbreak;}
"|"         {return or;}
"!="        {return negacion;}


{entero}    {return num;}
{flotante}  { return real; }
{ID}        {return id;} 

. {return ERROR;}
