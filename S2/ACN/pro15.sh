read -p "Employee No : " empno
read -p "Employee Name : " empname
read -p "Basic Salary : " salary
if [ $salary -gt 5000 ]
then
	hra=$(($salary*18/100))
else
	hra=550
fi
da=$(($salary*35/100))
pf=$(($salary*13/100))
ta=$(($salary*10/100))
gross_salary=$(( $salary+$hra+$pf+$da+$ta))
net_salary=$(($gross_salary-$pf))
echo "Employee No : $empno"
echo "Employee Name : $empname"
echo "Basic Salary : $salary"
echo "HRA : $hra"
echo "DA : $da"
echo "PF : $pf"
echo "TA : $ta"
echo "Gross Salary : $gross_salary"
echo "Net Salary : $net_salary"
echo -e "Employee No : $empno\nEmployee Name : $empname\nBasic Salary : $salary\nHRA : $hra\nDA : $da\nPF : $pf\nTA : $ta\nGross Salary : $gross_salary\nNet Sala.ry : $net_salary" > EmpData.txt
