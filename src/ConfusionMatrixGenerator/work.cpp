#include <bits/stdc++.h>

using namespace std;
map<pair<string,string> ,int > M;
int main()
{
    freopen("output.txt","r",stdin);

    for(int i=0;i<592;++i){
        string s;
        getline(cin,s);
        string t;
        freopen("MovingAvg(Max).txt","r",stdin);
        for(int j=0;j<=i;++j){
            getline(cin,t);
        }
        ++M[make_pair(s,t)];
        freopen("output.txt","r",stdin);
        for(int j=0;j<=i;++j)
        getline(cin,s);

    }

    freopen("movingavgmax(output).txt","w",stdout);

    auto it=M.begin();int total=0;

    while(it!=M.end()){
        cout << (*it).first.first << " " << (*it).first.second << " " << (*it).second << endl;
        total+=(*it).second;
        ++it;
    }
  //  cout << total << endl;
    return 0;
}
