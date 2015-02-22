angular.module('mahasiswa.controller', [])

    .controller('MhsController', ['$http','$scope', function($http, $scope){

        $scope.showAllMhs = function(){
          $http.get('mahasiswa/mahasiswa.json')
            .success(function(response){
              $scope.mahasiswas = response;
            });
        };

        $scope.tambah = function(mhs){
          $scope.resetError();

          $http.post('mahasiswa/add', mhs)
            .success(function(response){
              $scope.showAllMhs();
              $scope.mhs.npm = "";
              $scope.mhs.nama = "";
              $scope.mhs.jurusan = "";
            }).error(function(){
                $scope.setError('Terjadi Error saat penambahan data !');
            });
        };

        $scope.editAct = function(mhs){
          $scope.resetError();

          $http.put('mahasiswa/edit', mhs)
            .success(function(response){
              $scope.showAllMhs();
              $scope.mhs.npm = "";
              $scope.mhs.nama = "";
              $scope.mhs.jurusan = "";
              $scope.editMode = false;
            }).error(function(){
              $scope.setError('Terjadi Error saat pengeditan data !');
            });
        };

        $scope.edit = function(mhs){
          $scope.mhs = mhs;
          $scope.editMode = true;
        };

        $scope.hapus = function(id){
          $http.delete('mahasiswa/delete/'+id)
            .success(function(response){
              $scope.showAllMhs();
            })
        };

        $scope.setError = function(message) {
          $scope.error = true;
          $scope.errorMessage = message;
        };

        $scope.resetError = function() {
          $scope.error = false;
          $scope.errorMessage = '';
        };

        $scope.validasiNpm = function(){
          $scope.errorNpm = true;

          if(isNan($scope.mhs.npm)){
            $scope.errorNpmMsg = "NPM Harus berupa angka !";
          } else if($scope.mhs.npm ==  ""){
            $scope.errorNpmMsg = "NPM Harus Diisi";
          }
        }

        $scope.showAllMhs();
    }])

;
