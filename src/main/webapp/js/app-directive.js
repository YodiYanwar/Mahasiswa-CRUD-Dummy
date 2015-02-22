angular.module('mahasiswa.directive', [])

    .directive('isNumber', function () {
      return {
        require: 'ngModel',
        link: function (scope) {
          scope.$watch('mhs.npm', function(newValue,oldValue) {
            var arr = String(newValue).split("");
            if (arr.length === 0) return;
            if (arr.length === 1 && (arr[0] == '-' || arr[0] === '.' )) return;
            if (arr.length === 2 && newValue === '-.') return;
            if (isNaN(newValue)) {
              scope.mhs.npm = oldValue;
            }
          });
        }
      };
    });
