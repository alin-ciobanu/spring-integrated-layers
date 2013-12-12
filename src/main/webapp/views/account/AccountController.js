function AccountController ($scope, AccountService) {

    $scope.form = {
        'userName': '',
        'password': '',
        'email': ''
    }

    AccountService.list({}, function(data){

        $scope.accountList = data;

        console.log(data);
    });

    $scope.add = function () {

        AccountService.add($scope.form);

    }

}